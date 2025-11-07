# AgencyCar506 🚗

> [!IMPORTANT]
> **Este proyecto es completamente educativo y de desarrollo local.**
> 
> - ❌ NO pertenece a ninguna empresa real
> - ❌ NO contiene datos reales de ninguna organización
> - ❌ NO afecta a ningún sistema en producción
> - ✅ Todos los datos son ficticios y de prueba
> - ✅ Se ejecuta completamente en LOCAL
> - ✅ Es únicamente con fines de aprendizaje y demostración
> 
> **Toda la información, credenciales y datos mostrados son ejemplos para desarrollo.**

Sistema de Gestión para Agencia de Vehículos desarrollado en Java con PostgreSQL.

## 🚀 Inicio Rápido

### Prerrequisitos

- Java 21 o superior
- PostgreSQL 12 o superior
- Ant (para compilar desde código fuente)

### Instalación de la Base de Datos

#### Opción 1: Script Automático (Linux/Mac)

```bash
cd database
./install.sh
```

#### Opción 2: Manual

```bash
# 1. Crear la base de datos
psql -U postgres -c "CREATE DATABASE \"agenciaBd\";"

# 2. Ejecutar script de inicialización
psql -U postgres -d agenciaBd -f database/init_agenciaBd.sql

# 3. Crear usuario administrador
psql -U postgres -d agenciaBd -f database/create_admin_user.sql

# 4. Verificar instalación (opcional)
psql -U postgres -d agenciaBd -f database/test_database.sql
```

### Ejecutar la Aplicación

```bash
# Desde la raíz del proyecto
java -jar dist/Agency.jar
```

### Credenciales Iniciales

```
Usuario:    admin_adm
Contraseña: admin123_adm
```

**Importante**: El sufijo del usuario (`_adm`, `_pv`, `_ct`, `_rh`) determina qué módulo se abre:
- `_adm` → Administrador (acceso completo)
- `_pv` → Punto de Venta (ventas)
- `_ct` → Contador (contabilidad)
- `_rh` → Recursos Humanos (gestión de personal)

## 📦 Estructura del Proyecto

```
AgencyCar506/
├── src/                    # Código fuente Java
│   ├── Controlador/       # Lógica de negocio
│   ├── Modelo/            # Acceso a datos (DAO)
│   └── Vista/             # Interfaces gráficas (Swing)
├── lib/                    # Bibliotecas externas
│   ├── itextpdf-5.5.13.2.jar
│   ├── JTattoo-1.6.13.jar
│   ├── jcalendar-1.4.jar
│   └── postgresql-42.7.4.jar
├── database/               # Scripts de base de datos
│   ├── init_agenciaBd.sql
│   ├── create_admin_user.sql
│   ├── test_database.sql
│   ├── install.sh
│   └── README.md
├── dist/                   # Aplicación compilada
│   ├── Agency.jar
│   └── lib/
├── build.xml              # Script de Ant
└── README.md              # Este archivo
```

## 🛠️ Compilar desde Código Fuente

```bash
# Limpiar compilación anterior
ant clean

# Compilar proyecto
ant -f build.xml

# Ejecutar
java -jar dist/Agency.jar
```

## 📚 Documentación

- **Base de Datos**: Ver `database/README.md` para:
  - Estructura completa de la BD
  - Crear usuarios adicionales
  - Consultas útiles
  - Solución de problemas

- **Javadoc**: Después de compilar, consultar `dist/javadoc/index.html`

## 🔧 Configuración

### Cambiar Servidor de Base de Datos

Edita `src/Modelo/Conexion.java`:

```java
private static String url = "jdbc:postgresql://localhost:5432/";
```

Reemplaza `localhost` con la IP de tu servidor PostgreSQL.

## 📋 Funcionalidades

### Módulo Administrador (`_adm`)
- ✅ Gestión completa de empleados
- ✅ Gestión de usuarios del sistema
- ✅ Gestión de inventario de vehículos
- ✅ Reportes generales
- ✅ Configuración del sistema

### Módulo Punto de Venta (`_pv`)
- ✅ Registro de ventas
- ✅ Gestión de clientes
- ✅ Consulta de inventario
- ✅ Generación de facturas (PDF)

### Módulo Contador (`_ct`)
- ✅ Registro de gastos
- ✅ Registro de compras
- ✅ Gestión de deudas
- ✅ Consulta de inventario
- ✅ Reportes contables

### Módulo Recursos Humanos (`_rh`)
- ✅ Gestión de empleados
- ✅ Gestión de puestos
- ✅ Consulta de departamentos
- ✅ Historial de empleados

## 🔐 Crear Nuevos Usuarios

### Desde la Aplicación
1. Iniciar sesión como administrador
2. Ir a Gestión de Empleados
3. Registrar nuevo empleado
4. Crear cuenta de usuario

### Desde PostgreSQL

Ver ejemplos completos en `database/README.md`, sección "Crear Usuarios para la Aplicación".

## ⚠️ Solución de Problemas

### No puedo conectar a la base de datos
1. Verificar que PostgreSQL está corriendo: `sudo systemctl status postgresql`
2. Verificar credenciales en la aplicación
3. Verificar que el usuario existe: `psql -U postgres -d agenciaBd -c "\du"`

### Error: "package does not exist" al compilar
Las dependencias ya están incluidas en `lib/`. Ejecuta `ant clean` y luego `ant -f build.xml`.

### La aplicación no inicia
```bash
# Verificar Java
java -version  # Debe ser 21 o superior

# Ver errores detallados
java -jar dist/Agency.jar
```

### Error al generar PDF
Verificar que `itextpdf-5.5.13.2.jar` está en `dist/lib/` después de compilar.

## 📞 Información del Proyecto

- **Versión**: 1.0
- **Java**: 21
- **PostgreSQL**: 12+
- **Librerías**:
  - iText 5.5.13.2 (generación PDF)
  - JTattoo 1.6.13 (Look & Feel)
  - JCalendar 1.4 (selector de fechas)
  - PostgreSQL JDBC 42.7.4

## 📄 Licencia

Este proyecto es de uso educativo/interno.

## 🤝 Contribuciones

Para contribuir al proyecto:
1. Haz un fork del repositorio
2. Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit tus cambios (`git commit -am 'Añadir nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Crea un Pull Request

---

**Desarrollado por**: EleazarDevFS  
**Repositorio**: [AgencyCar](https://github.com/EleazarDevFS/AgencyCar)  
**Branch**: main
```markdown
Usuario:    admin_adm
Contraseña: admin123_adm
```
