-- =====================================================
-- Script de Creación de Base de Datos: agenciaBd
-- Sistema de Gestión de Agencia de Vehículos
-- PostgreSQL 12+
-- =====================================================
-- Fecha: 6 de noviembre de 2025
-- Descripción: Script completo para inicializar la base de datos
--              de la aplicación AgencyCar506
-- =====================================================

-- Crear la base de datos (ejecutar como superusuario postgres)
-- DROP DATABASE IF EXISTS "agenciaBd";
-- CREATE DATABASE "agenciaBd"
--     WITH 
--     OWNER = postgres
--     ENCODING = 'UTF8'
--     LC_COLLATE = 'es_ES.UTF-8'
--     LC_CTYPE = 'es_ES.UTF-8'
--     TABLESPACE = pg_default
--     CONNECTION LIMIT = -1;

-- Conectar a la base de datos
\c agenciaBd;

-- =====================================================
-- 1. CREAR ESQUEMA PRIVADO
-- =====================================================
DROP SCHEMA IF EXISTS "privateSchema" CASCADE;
CREATE SCHEMA "privateSchema";

-- =====================================================
-- 2. CREAR TIPOS DE DATOS PERSONALIZADOS (ENUMS)
-- =====================================================

-- Tipo para el estado del empleado
CREATE TYPE "privateSchema"."statusValido" AS ENUM (
    'Activo',
    'Inactivo',
    'Vacaciones',
    'Incapacidad',
    'Suspendido'
);

-- Tipo para método de pago
CREATE TYPE "privateSchema".metodo_de_pago AS ENUM (
    'Efectivo',
    'Tarjeta',
    'Transferencia',
    'Cheque',
    'Credito'
);

-- Tipo para clasificación de registros
CREATE TYPE "privateSchema".tipo_registro AS ENUM (
    'venta',
    'compra',
    'gasto',
    'deuda'
);

-- =====================================================
-- 3. CREAR TABLAS
-- =====================================================

-- Tabla: departamento
CREATE TABLE "privateSchema".departamento (
    iddepartamento SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    descripcion TEXT
);

-- Tabla: area
CREATE TABLE "privateSchema".area (
    idarea SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    descripcion TEXT,
    iddepartamento INT REFERENCES "privateSchema".departamento(iddepartamento) ON DELETE CASCADE
);

-- Tabla: puesto
CREATE TABLE "privateSchema".puesto (
    idpuesto SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    salario DECIMAL(10, 2) NOT NULL CHECK (salario >= 0),
    descripcion TEXT,
    idarea INT REFERENCES "privateSchema".area(idarea) ON DELETE SET NULL
);

-- Tabla: empleado
CREATE TABLE "privateSchema".empleado (
    idempleado VARCHAR(20) PRIMARY KEY,
    idpuesto INT REFERENCES "privateSchema".puesto(idpuesto) ON DELETE SET NULL,
    nombre VARCHAR(100) NOT NULL,
    apellidop VARCHAR(100) NOT NULL,
    apellidom VARCHAR(100),
    fechanacimiento DATE NOT NULL,
    fechaingreso DATE NOT NULL,
    status "privateSchema"."statusValido" DEFAULT 'Activo'
);

-- Tabla: contacto_empleado
CREATE TABLE "privateSchema".contacto_empleado (
    idempleado VARCHAR(20) PRIMARY KEY REFERENCES "privateSchema".empleado(idempleado) ON DELETE CASCADE,
    ubicacion VARCHAR(255),
    email VARCHAR(100) UNIQUE,
    telefono VARCHAR(20)
);

-- Tabla: cuentas (relación empleado-usuario PostgreSQL)
CREATE TABLE "privateSchema".cuentas (
    idempleado VARCHAR(20) PRIMARY KEY REFERENCES "privateSchema".empleado(idempleado) ON DELETE CASCADE,
    asociada VARCHAR(100) NOT NULL -- Contraseña o referencia al rol de PostgreSQL
);

-- Tabla: cliente
CREATE TABLE "privateSchema".cliente (
    idcliente VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidop VARCHAR(100) NOT NULL,
    apellidom VARCHAR(100),
    telefono VARCHAR(20),
    direccion VARCHAR(255),
    status INT DEFAULT 1 CHECK (status IN (0, 1))
);

-- Tabla: vehiculos
CREATE TABLE "privateSchema".vehiculos (
    idvehiculo VARCHAR(50) PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    descripcion TEXT,
    cantidad INT NOT NULL DEFAULT 0 CHECK (cantidad >= 0),
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    anio INT CHECK (anio >= 1900 AND anio <= 2100),
    color VARCHAR(30),
    precio DECIMAL(12, 2) NOT NULL CHECK (precio >= 0),
    nombre VARCHAR(100) NOT NULL
);

-- Tabla: registros (registro de transacciones)
CREATE TABLE "privateSchema".registros (
    idregistro SERIAL PRIMARY KEY,
    idempleado VARCHAR(20) REFERENCES "privateSchema".empleado(idempleado) ON DELETE SET NULL,
    tipo "privateSchema".tipo_registro NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tabla: ventas
CREATE TABLE "privateSchema".ventas (
    idventa SERIAL PRIMARY KEY,
    idcliente VARCHAR(20) REFERENCES "privateSchema".cliente(idcliente) ON DELETE CASCADE,
    idregistro INT REFERENCES "privateSchema".registros(idregistro) ON DELETE CASCADE,
    idvehiculo VARCHAR(50) REFERENCES "privateSchema".vehiculos(idvehiculo) ON DELETE CASCADE,
    fecha DATE NOT NULL,
    cantidadvendida INT NOT NULL CHECK (cantidadvendida > 0),
    montototal DECIMAL(12, 2) NOT NULL CHECK (montototal >= 0)
);

-- Tabla: compras
CREATE TABLE "privateSchema".compras (
    idcompra SERIAL PRIMARY KEY,
    idregistro INT REFERENCES "privateSchema".registros(idregistro) ON DELETE CASCADE,
    total DECIMAL(12, 2) NOT NULL CHECK (total >= 0),
    metododepago "privateSchema".metodo_de_pago NOT NULL,
    descripcion TEXT,
    fecha DATE NOT NULL
);

-- Tabla: gastos
CREATE TABLE "privateSchema".gastos (
    idgasto SERIAL PRIMARY KEY,
    idregistro INT REFERENCES "privateSchema".registros(idregistro) ON DELETE CASCADE,
    fecha DATE NOT NULL,
    descripcion TEXT NOT NULL,
    total DECIMAL(12, 2) NOT NULL CHECK (total >= 0),
    metododepago "privateSchema".metodo_de_pago NOT NULL
);

-- Tabla: deudas
CREATE TABLE "privateSchema".deudas (
    iddeuda SERIAL PRIMARY KEY,
    idregistro INT REFERENCES "privateSchema".registros(idregistro) ON DELETE CASCADE,
    motivo TEXT NOT NULL,
    fecha DATE NOT NULL,
    monto DECIMAL(12, 2) NOT NULL CHECK (monto >= 0),
    metododepago "privateSchema".metodo_de_pago NOT NULL,
    interes DECIMAL(5, 2) DEFAULT 0 CHECK (interes >= 0),
    acreedor VARCHAR(100),
    mesesplazo INT CHECK (mesesplazo > 0)
);

-- =====================================================
-- 4. CREAR ÍNDICES PARA MEJORAR RENDIMIENTO
-- =====================================================

CREATE INDEX idx_empleado_status ON "privateSchema".empleado(status);
CREATE INDEX idx_empleado_puesto ON "privateSchema".empleado(idpuesto);
CREATE INDEX idx_vehiculos_marca ON "privateSchema".vehiculos(marca);
CREATE INDEX idx_vehiculos_modelo ON "privateSchema".vehiculos(modelo);
CREATE INDEX idx_vehiculos_nombre ON "privateSchema".vehiculos(nombre);
CREATE INDEX idx_ventas_fecha ON "privateSchema".ventas(fecha);
CREATE INDEX idx_ventas_cliente ON "privateSchema".ventas(idcliente);
CREATE INDEX idx_registros_tipo ON "privateSchema".registros(tipo);
CREATE INDEX idx_registros_fecha ON "privateSchema".registros(fecha);

-- =====================================================
-- 5. CREAR PROCEDIMIENTOS ALMACENADOS
-- =====================================================

-- Procedimiento para restar cantidad del inventario de vehículos
CREATE OR REPLACE PROCEDURE "privateSchema".resta_cantidad(
    cantidad_a_restar INT,
    vehiculo_id VARCHAR(50)
)
LANGUAGE plpgsql
AS $$
BEGIN
    UPDATE "privateSchema".vehiculos
    SET cantidad = cantidad - cantidad_a_restar
    WHERE idvehiculo = vehiculo_id AND cantidad >= cantidad_a_restar;
    
    IF NOT FOUND THEN
        RAISE EXCEPTION 'No hay suficiente cantidad en el inventario o el vehículo no existe';
    END IF;
END;
$$;

-- Procedimiento para sumar compras al inventario de vehículos
CREATE OR REPLACE PROCEDURE "privateSchema".suuma_compras(
    vehiculo_id VARCHAR(50)
)
LANGUAGE plpgsql
AS $$
BEGIN
    -- Obtener la suma de compras para este vehículo y actualizar la cantidad
    UPDATE "privateSchema".vehiculos v
    SET cantidad = cantidad + COALESCE(
        (SELECT SUM(1) 
         FROM "privateSchema".compras c
         INNER JOIN "privateSchema".registros r ON c.idregistro = r.idregistro
         WHERE c.descripcion LIKE '%' || vehiculo_id || '%'), 0)
    WHERE v.idvehiculo = vehiculo_id;
END;
$$;

-- =====================================================
-- 6. CREAR ROL DE LECTURA/ESCRITURA
-- =====================================================

-- Crear rol base para permisos compartidos
DO $$
BEGIN
    IF NOT EXISTS (SELECT FROM pg_roles WHERE rolname = 'readwrite') THEN
        CREATE ROLE readwrite;
    END IF;
END $$;

-- Otorgar permisos de uso del esquema
GRANT USAGE ON SCHEMA "privateSchema" TO readwrite;

-- Otorgar permisos en tablas existentes
GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA "privateSchema" TO readwrite;

-- Otorgar permisos en secuencias (para SERIAL)
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA "privateSchema" TO readwrite;

-- Hacer que los permisos se apliquen automáticamente a tablas futuras
ALTER DEFAULT PRIVILEGES IN SCHEMA "privateSchema" 
GRANT SELECT, INSERT, UPDATE, DELETE ON TABLES TO readwrite;

ALTER DEFAULT PRIVILEGES IN SCHEMA "privateSchema" 
GRANT USAGE, SELECT ON SEQUENCES TO readwrite;

-- =====================================================
-- 7. INSERTAR DATOS INICIALES
-- =====================================================

-- Insertar departamentos
INSERT INTO "privateSchema".departamento (nombre, descripcion) VALUES
('Ventas', 'Departamento encargado de las ventas de vehículos'),
('Recursos Humanos', 'Departamento de gestión de personal'),
('Contabilidad', 'Departamento de finanzas y contabilidad'),
('Administración', 'Departamento administrativo general');

-- Insertar áreas
INSERT INTO "privateSchema".area (nombre, descripcion, iddepartamento) VALUES
('Ventas Directas', 'Área de ventas al público', 1),
('Ventas Corporativas', 'Área de ventas a empresas', 1),
('Reclutamiento', 'Área de selección de personal', 2),
('Finanzas', 'Área de análisis financiero', 3),
('Gerencia', 'Área de dirección general', 4);

-- Insertar puestos
INSERT INTO "privateSchema".puesto (nombre, salario, descripcion, idarea) VALUES
('Gerente General', 45000.00, 'Dirección general de la agencia', 5),
('Vendedor', 15000.00, 'Ventas directas al público', 1),
('Contador', 20000.00, 'Gestión contable y financiera', 4),
('Gerente de Recursos Humanos', 30000.00, 'Gestión del personal', 3),
('Asistente Administrativo', 12000.00, 'Apoyo administrativo general', 5);

-- Insertar empleado administrador por defecto
INSERT INTO "privateSchema".empleado (idempleado, idpuesto, nombre, apellidop, apellidom, fechanacimiento, fechaingreso, status) VALUES
('ADMIN001', 1, 'Administrador', 'Sistema', 'Principal', '1990-01-01', CURRENT_DATE, 'Activo');

-- Insertar contacto del administrador
INSERT INTO "privateSchema".contacto_empleado (idempleado, ubicacion, email, telefono) VALUES
('ADMIN001', 'Oficinas Centrales', 'admin@agenciacar.com', '5555555555');

-- Insertar vehículos de ejemplo
INSERT INTO "privateSchema".vehiculos (idvehiculo, tipo, descripcion, cantidad, marca, modelo, anio, color, precio, nombre) VALUES
('VEH001', 'Sedan', 'Sedán ejecutivo de lujo', 5, 'Toyota', 'Camry', 2024, 'Negro', 450000.00, 'Toyota Camry XLE'),
('VEH002', 'SUV', 'SUV familiar compacta', 3, 'Honda', 'CR-V', 2024, 'Blanco', 520000.00, 'Honda CR-V Touring'),
('VEH003', 'Pickup', 'Pickup de trabajo pesado', 2, 'Ford', 'F-150', 2024, 'Gris', 680000.00, 'Ford F-150 Raptor'),
('VEH004', 'Hatchback', 'Compacto urbano eficiente', 8, 'Mazda', 'Mazda3', 2024, 'Rojo', 350000.00, 'Mazda3 Sport'),
('VEH005', 'Sedan', 'Sedán deportivo de lujo', 2, 'BMW', 'Serie 3', 2024, 'Azul', 850000.00, 'BMW 330i M Sport');

-- Insertar cliente de ejemplo
INSERT INTO "privateSchema".cliente (idcliente, nombre, apellidop, apellidom, telefono, direccion, status) VALUES
('CLI001', 'Juan', 'Pérez', 'García', '5551234567', 'Av. Principal 123, CDMX', 1);

-- =====================================================
-- 8. CREAR USUARIO ADMINISTRADOR PARA LA APLICACIÓN
-- =====================================================

-- Nota: Ejecutar estas líneas manualmente según sea necesario
-- El usuario debe ser creado desde un superusuario de PostgreSQL

-- Ejemplo para crear un usuario administrador de la aplicación:
-- CREATE ROLE "admin_adm" WITH LOGIN SUPERUSER PASSWORD 'admin123_adm';
-- GRANT ALL PRIVILEGES ON DATABASE "agenciaBd" TO "admin_adm";
-- GRANT ALL PRIVILEGES ON SCHEMA "privateSchema" TO "admin_adm";
-- GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA "privateSchema" TO "admin_adm";
-- GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA "privateSchema" TO "admin_adm";

-- Asociar la cuenta con el empleado
-- INSERT INTO "privateSchema".cuentas (idempleado, asociada) VALUES
-- ('ADMIN001', 'admin123_adm');

-- =====================================================
-- 9. COMENTARIOS EN TABLAS Y COLUMNAS
-- =====================================================

COMMENT ON SCHEMA "privateSchema" IS 'Esquema privado para la aplicación AgencyCar506';
COMMENT ON TABLE "privateSchema".empleado IS 'Tabla de empleados de la agencia';
COMMENT ON TABLE "privateSchema".vehiculos IS 'Inventario de vehículos disponibles';
COMMENT ON TABLE "privateSchema".ventas IS 'Registro de ventas realizadas';
COMMENT ON TABLE "privateSchema".cliente IS 'Catálogo de clientes';
COMMENT ON TABLE "privateSchema".registros IS 'Registro general de transacciones';
COMMENT ON TABLE "privateSchema".cuentas IS 'Relación entre empleados y usuarios del sistema';

-- =====================================================
-- 10. VERIFICACIÓN DE LA INSTALACIÓN
-- =====================================================

-- Consultar tablas creadas
SELECT schemaname, tablename 
FROM pg_tables 
WHERE schemaname = 'privateSchema'
ORDER BY tablename;

-- Consultar tipos de datos creados
SELECT n.nspname AS schema, t.typname AS type_name
FROM pg_type t
JOIN pg_namespace n ON t.typnamespace = n.oid
WHERE n.nspname = 'privateSchema' AND t.typtype = 'e'
ORDER BY type_name;

-- Verificar datos iniciales
SELECT COUNT(*) AS total_empleados FROM "privateSchema".empleado;
SELECT COUNT(*) AS total_vehiculos FROM "privateSchema".vehiculos;
SELECT COUNT(*) AS total_puestos FROM "privateSchema".puesto;

-- =====================================================
-- FIN DEL SCRIPT
-- =====================================================

-- Para crear usuarios adicionales desde la aplicación:
-- La aplicación usa los métodos:
--   - createSuperUser(nombreUsuario, pass) para administradores
--   - createPv(nombreUsuario, pass) para vendedores
--   - createConta(nombreUsuario, pass) para contadores
--   - createRh(nombreUsuario, pass) para recursos humanos

COMMIT;

\echo '============================================='
\echo 'Base de datos agenciaBd creada exitosamente'
\echo '============================================='
\echo 'Próximos pasos:'
\echo '1. Crear un usuario administrador con:'
\echo '   CREATE ROLE "tu_usuario_adm" WITH LOGIN SUPERUSER PASSWORD ''tu_password_adm'';'
\echo '2. Asociar el usuario con el empleado ADMIN001 en la tabla cuentas'
\echo '3. Usar ese usuario para conectar desde la aplicación AgencyCar506'
\echo '============================================='
