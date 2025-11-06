# Base de Datos AgencyCar506

## 📋 Descripción

Base de datos PostgreSQL para el sistema de gestión de la Agencia de Vehículos.

## 🚀 Instalación

### 1. Crear la Base de Datos

```bash
# Conectar como superusuario postgres
psql -U postgres

# Crear la base de datos
CREATE DATABASE "agenciaBd"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'es_ES.UTF-8'
    LC_CTYPE = 'es_ES.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

# Salir de psql
\q
```

### 2. Ejecutar el Script de Inicialización

```bash
# Ejecutar el script SQL desde la terminal
psql -U postgres -d agenciaBd -f database/init_agenciaBd.sql
```

O desde psql:

```sql
\c agenciaBd
\i /ruta/completa/al/archivo/database/init_agenciaBd.sql
```

## 👥 Crear Usuarios para la Aplicación

La aplicación requiere usuarios de PostgreSQL con permisos específicos según su rol.

### Crear Usuario Administrador

```sql
-- Conectar como postgres a agenciaBd
psql -U postgres -d agenciaBd

-- Crear rol de administrador
CREATE ROLE "admin_adm" WITH LOGIN SUPERUSER PASSWORD 'MiPassword123_adm';

-- Asociar con el empleado (insertar en tabla cuentas)
INSERT INTO "privateSchema".cuentas (idempleado, asociada) VALUES
('ADMIN001', 'MiPassword123_adm');
```

### Crear Usuario para Punto de Venta (Vendedor)

```sql
-- Primero registrar el empleado desde la aplicación
-- O manualmente:
INSERT INTO "privateSchema".empleado (idempleado, idpuesto, nombre, apellidop, apellidom, fechanacimiento, fechaingreso, status) VALUES
('VEN001', 2, 'Carlos', 'Ramírez', 'López', '1995-03-15', CURRENT_DATE, 'Activo');

INSERT INTO "privateSchema".contacto_empleado (idempleado, ubicacion, email, telefono) VALUES
('VEN001', 'Sucursal Centro', 'carlos.ramirez@agenciacar.com', '5551112222');

-- Crear el rol desde psql
CREATE ROLE "vendedor1_pv" WITH LOGIN PASSWORD 'VendPass123_pv';
GRANT USAGE ON SCHEMA "privateSchema" TO "vendedor1_pv";
GRANT SELECT, INSERT, UPDATE ON "privateSchema".ventas, "privateSchema".registros, 
      "privateSchema".vehiculos, "privateSchema".contacto_empleado, "privateSchema".cliente 
      TO "vendedor1_pv";
GRANT readwrite TO "vendedor1_pv";

-- Asociar con el empleado
INSERT INTO "privateSchema".cuentas (idempleado, asociada) VALUES
('VEN001', 'VendPass123_pv');
```

### Crear Usuario para Contador

```sql
-- Primero registrar el empleado
INSERT INTO "privateSchema".empleado (idempleado, idpuesto, nombre, apellidop, apellidom, fechanacimiento, fechaingreso, status) VALUES
('CONT001', 3, 'María', 'González', 'Martínez', '1988-07-20', CURRENT_DATE, 'Activo');

INSERT INTO "privateSchema".contacto_empleado (idempleado, ubicacion, email, telefono) VALUES
('CONT001', 'Oficinas Centrales', 'maria.gonzalez@agenciacar.com', '5553334444');

-- Crear el rol
CREATE ROLE "contador1_ct" WITH LOGIN PASSWORD 'ContPass123_ct';
GRANT USAGE ON SCHEMA "privateSchema" TO "contador1_ct";
GRANT SELECT, INSERT, UPDATE ON "privateSchema".vehiculos, "privateSchema".registros, 
      "privateSchema".deudas, "privateSchema".contacto_empleado, "privateSchema".gastos 
      TO "contador1_ct";
GRANT readwrite TO "contador1_ct";

-- Asociar con el empleado
INSERT INTO "privateSchema".cuentas (idempleado, asociada) VALUES
('CONT001', 'ContPass123_ct');
```

### Crear Usuario para Recursos Humanos

```sql
-- Primero registrar el empleado
INSERT INTO "privateSchema".empleado (idempleado, idpuesto, nombre, apellidop, apellidom, fechanacimiento, fechaingreso, status) VALUES
('RH001', 4, 'Ana', 'Torres', 'Sánchez', '1992-11-10', CURRENT_DATE, 'Activo');

INSERT INTO "privateSchema".contacto_empleado (idempleado, ubicacion, email, telefono) VALUES
('RH001', 'Oficinas Centrales', 'ana.torres@agenciacar.com', '5555556666');

-- Crear el rol
CREATE ROLE "rh1_rh" WITH LOGIN PASSWORD 'RhPass123_rh';
GRANT USAGE ON SCHEMA "privateSchema" TO "rh1_rh";
GRANT SELECT, INSERT, UPDATE ON "privateSchema".empleado, "privateSchema".registros, 
      "privateSchema".puesto, "privateSchema".contacto_empleado, "privateSchema".departamento, 
      "privateSchema".area TO "rh1_rh";
GRANT readwrite TO "rh1_rh";

-- Asociar con el empleado
INSERT INTO "privateSchema".cuentas (idempleado, asociada) VALUES
('RH001', 'RhPass123_rh');
```

## 🔑 Convención de Nombres de Usuarios

La aplicación usa el siguiente formato para nombres de usuario:

- **Administrador**: `nombre_adm` (sufijo: `_adm`)
- **Punto de Venta**: `nombre_pv` (sufijo: `_pv`)
- **Contador**: `nombre_ct` (sufijo: `_ct`)
- **Recursos Humanos**: `nombre_rh` (sufijo: `_rh`)

**Importante**: El sufijo determina qué módulo de la aplicación se abre al iniciar sesión.

## 📊 Estructura de la Base de Datos

### Tablas Principales

1. **empleado** - Información de empleados
2. **contacto_empleado** - Datos de contacto de empleados
3. **cuentas** - Relación empleado-usuario PostgreSQL
4. **vehiculos** - Inventario de vehículos
5. **cliente** - Catálogo de clientes
6. **ventas** - Registro de ventas
7. **compras** - Registro de compras
8. **gastos** - Registro de gastos
9. **deudas** - Registro de deudas
10. **registros** - Log general de transacciones
11. **puesto** - Catálogo de puestos
12. **area** - Áreas de la empresa
13. **departamento** - Departamentos de la empresa

### Tipos de Datos Personalizados (ENUM)

- `statusValido`: Activo, Inactivo, Vacaciones, Incapacidad, Suspendido
- `metodo_de_pago`: Efectivo, Tarjeta, Transferencia, Cheque, Credito
- `tipo_registro`: venta, compra, gasto, deuda

## 🔧 Procedimientos Almacenados

### resta_cantidad(cantidad, vehiculo_id)
Resta cantidad del inventario al realizar una venta.

```sql
CALL "privateSchema".resta_cantidad(2, 'VEH001');
```

### suuma_compras(vehiculo_id)
Suma compras al inventario de un vehículo.

```sql
CALL "privateSchema".suuma_compras('VEH001');
```

## 🔐 Configuración de Conexión

La aplicación se conecta con:

- **URL**: `jdbc:postgresql://localhost:5432/agenciaBd`
- **Usuario**: El nombre de usuario de PostgreSQL (sufijo indica el módulo)
- **Password**: La contraseña del rol de PostgreSQL

## 📝 Consultas Útiles

### Ver todos los usuarios/roles creados

```sql
SELECT rolname, rolcanlogin, rolsuper 
FROM pg_roles 
WHERE rolcanlogin = true 
ORDER BY rolname;
```

### Ver empleados y sus cuentas asociadas

```sql
SELECT e.idempleado, e.nombre, e.apellidop, c.asociada
FROM "privateSchema".empleado e
LEFT JOIN "privateSchema".cuentas c ON e.idempleado = c.idempleado
ORDER BY e.idempleado;
```

### Ver inventario de vehículos

```sql
SELECT idvehiculo, nombre, marca, modelo, cantidad, precio
FROM "privateSchema".vehiculos
ORDER BY nombre;
```

### Ver ventas realizadas

```sql
SELECT v.idventa, c.nombre AS cliente, ve.nombre AS vehiculo, 
       v.fecha, v.cantidadvendida, v.montototal
FROM "privateSchema".ventas v
JOIN "privateSchema".cliente c ON v.idcliente = c.idcliente
JOIN "privateSchema".vehiculos ve ON v.idvehiculo = ve.idvehiculo
ORDER BY v.fecha DESC;
```

## 🛠️ Mantenimiento

### Respaldo de la Base de Datos

```bash
# Crear respaldo
pg_dump -U postgres -d agenciaBd -F c -b -v -f agenciaBd_backup_$(date +%Y%m%d).backup

# Restaurar desde respaldo
pg_restore -U postgres -d agenciaBd -v agenciaBd_backup_YYYYMMDD.backup
```

### Limpiar y reiniciar

```bash
# ADVERTENCIA: Esto elimina TODOS los datos
DROP DATABASE "agenciaBd";
# Luego ejecutar nuevamente el script de inicialización
```

## ⚠️ Solución de Problemas

### Error: "database agenciaBd does not exist"
Crear la base de datos manualmente antes de ejecutar el script.

### Error: "permission denied for schema privateSchema"
Verificar que el usuario tiene permisos sobre el esquema:
```sql
GRANT USAGE ON SCHEMA "privateSchema" TO "nombre_usuario";
```

### Error al iniciar sesión desde la aplicación
1. Verificar que el usuario existe en PostgreSQL
2. Verificar que existe en la tabla `cuentas`
3. Verificar que la contraseña coincide
4. Verificar que el sufijo del nombre de usuario es correcto (_adm, _pv, _ct, _rh)

## 📞 Soporte

Para problemas o dudas sobre la base de datos, consultar la documentación del código fuente en:
- `src/Modelo/Conexion.java`
- `src/Modelo/Querys.java`
- `src/Modelo/Inserts.java`
- `src/Modelo/Updates.java`
