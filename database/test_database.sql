-- =====================================================
-- Script de Pruebas de la Base de Datos
-- =====================================================
-- Este script verifica que la base de datos fue creada
-- correctamente y todas las estructuras existen
-- =====================================================

\c agenciaBd;

\echo ''
\echo '============================================='
\echo 'VERIFICACIÓN DE LA BASE DE DATOS agenciaBd'
\echo '============================================='
\echo ''

-- =====================================================
-- 1. VERIFICAR ESQUEMA
-- =====================================================
\echo '1. Verificando esquema privateSchema...'
SELECT 'Esquema encontrado: ' || nspname AS resultado
FROM pg_namespace 
WHERE nspname = 'privateSchema';

-- =====================================================
-- 2. VERIFICAR TIPOS DE DATOS ENUM
-- =====================================================
\echo ''
\echo '2. Verificando tipos de datos personalizados (ENUM)...'
SELECT 
    t.typname AS "Tipo",
    string_agg(e.enumlabel, ', ' ORDER BY e.enumsortorder) AS "Valores"
FROM pg_type t
JOIN pg_enum e ON t.oid = e.enumtypid
JOIN pg_namespace n ON t.typnamespace = n.oid
WHERE n.nspname = 'privateSchema'
GROUP BY t.typname
ORDER BY t.typname;

-- =====================================================
-- 3. VERIFICAR TABLAS
-- =====================================================
\echo ''
\echo '3. Verificando tablas creadas...'
SELECT tablename AS "Tabla"
FROM pg_tables 
WHERE schemaname = 'privateSchema'
ORDER BY tablename;

-- =====================================================
-- 4. VERIFICAR DATOS INICIALES
-- =====================================================
\echo ''
\echo '4. Verificando datos iniciales...'
\echo ''
\echo '   Departamentos:'
SELECT COUNT(*) AS total FROM "privateSchema".departamento;
SELECT iddepartamento, nombre FROM "privateSchema".departamento ORDER BY iddepartamento;

\echo ''
\echo '   Áreas:'
SELECT COUNT(*) AS total FROM "privateSchema".area;
SELECT idarea, nombre, iddepartamento FROM "privateSchema".area ORDER BY idarea;

\echo ''
\echo '   Puestos:'
SELECT COUNT(*) AS total FROM "privateSchema".puesto;
SELECT idpuesto, nombre, salario FROM "privateSchema".puesto ORDER BY idpuesto;

\echo ''
\echo '   Empleados:'
SELECT COUNT(*) AS total FROM "privateSchema".empleado;
SELECT idempleado, nombre, apellidop, status FROM "privateSchema".empleado;

\echo ''
\echo '   Vehículos en inventario:'
SELECT COUNT(*) AS total FROM "privateSchema".vehiculos;
SELECT idvehiculo, nombre, marca, modelo, cantidad, precio 
FROM "privateSchema".vehiculos 
ORDER BY idvehiculo;

\echo ''
\echo '   Clientes:'
SELECT COUNT(*) AS total FROM "privateSchema".cliente;
SELECT idcliente, nombre, apellidop FROM "privateSchema".cliente;

-- =====================================================
-- 5. VERIFICAR PROCEDIMIENTOS ALMACENADOS
-- =====================================================
\echo ''
\echo '5. Verificando procedimientos almacenados...'
SELECT proname AS "Procedimiento", pg_get_function_arguments(oid) AS "Argumentos"
FROM pg_proc
WHERE pronamespace = (SELECT oid FROM pg_namespace WHERE nspname = 'privateSchema')
AND prokind = 'p'
ORDER BY proname;

-- =====================================================
-- 6. VERIFICAR ÍNDICES
-- =====================================================
\echo ''
\echo '6. Verificando índices creados...'
SELECT 
    schemaname AS "Esquema",
    tablename AS "Tabla",
    indexname AS "Índice"
FROM pg_indexes
WHERE schemaname = 'privateSchema'
ORDER BY tablename, indexname;

-- =====================================================
-- 7. VERIFICAR ROLES Y PERMISOS
-- =====================================================
\echo ''
\echo '7. Verificando rol readwrite...'
SELECT rolname AS "Rol", rolcanlogin AS "Puede login"
FROM pg_roles 
WHERE rolname = 'readwrite';

\echo ''
\echo '   Permisos del rol readwrite en privateSchema:'
SELECT 
    grantee AS "Usuario/Rol",
    privilege_type AS "Permiso"
FROM information_schema.schema_privileges
WHERE table_schema = 'privateSchema' AND grantee = 'readwrite'
ORDER BY privilege_type;

-- =====================================================
-- 8. VERIFICAR USUARIOS DE LA APLICACIÓN
-- =====================================================
\echo ''
\echo '8. Verificando usuarios de la aplicación...'
SELECT 
    e.idempleado AS "ID Empleado",
    e.nombre || ' ' || e.apellidop AS "Nombre",
    c.asociada AS "Usuario PostgreSQL"
FROM "privateSchema".empleado e
LEFT JOIN "privateSchema".cuentas c ON e.idempleado = c.idempleado
ORDER BY e.idempleado;

-- =====================================================
-- 9. ESTADÍSTICAS DE LA BASE DE DATOS
-- =====================================================
\echo ''
\echo '9. Estadísticas generales...'
\echo ''

SELECT 
    'Departamentos' AS "Tabla",
    COUNT(*) AS "Registros"
FROM "privateSchema".departamento
UNION ALL
SELECT 'Áreas', COUNT(*) FROM "privateSchema".area
UNION ALL
SELECT 'Puestos', COUNT(*) FROM "privateSchema".puesto
UNION ALL
SELECT 'Empleados', COUNT(*) FROM "privateSchema".empleado
UNION ALL
SELECT 'Contactos', COUNT(*) FROM "privateSchema".contacto_empleado
UNION ALL
SELECT 'Cuentas', COUNT(*) FROM "privateSchema".cuentas
UNION ALL
SELECT 'Vehículos', COUNT(*) FROM "privateSchema".vehiculos
UNION ALL
SELECT 'Clientes', COUNT(*) FROM "privateSchema".cliente
UNION ALL
SELECT 'Ventas', COUNT(*) FROM "privateSchema".ventas
UNION ALL
SELECT 'Compras', COUNT(*) FROM "privateSchema".compras
UNION ALL
SELECT 'Gastos', COUNT(*) FROM "privateSchema".gastos
UNION ALL
SELECT 'Deudas', COUNT(*) FROM "privateSchema".deudas
UNION ALL
SELECT 'Registros', COUNT(*) FROM "privateSchema".registros;

-- =====================================================
-- 10. RESUMEN
-- =====================================================
\echo ''
\echo '============================================='
\echo 'RESUMEN DE VERIFICACIÓN'
\echo '============================================='
\echo 'Si todos los elementos anteriores aparecen correctamente,'
\echo 'la base de datos está lista para usarse con la aplicación.'
\echo ''
\echo 'Próximos pasos:'
\echo '1. Ejecutar: database/create_admin_user.sql'
\echo '2. Iniciar la aplicación: java -jar dist/Agency.jar'
\echo '3. Login con usuario: admin_adm, password: admin123_adm'
\echo '============================================='
\echo ''
