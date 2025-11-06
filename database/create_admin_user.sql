-- =====================================================
-- Script de Ejemplo: Crear Usuario Administrador
-- =====================================================
-- Este script crea un usuario administrador de prueba
-- para que puedas iniciar sesión inmediatamente en la app
-- =====================================================

-- Conectar a la base de datos agenciaBd
\c agenciaBd;

-- =====================================================
-- CREAR USUARIO ADMINISTRADOR DE PRUEBA
-- =====================================================

-- Crear el rol de PostgreSQL con permisos de superusuario
-- Nombre: admin_adm (el sufijo _adm indica que es administrador)
-- Password: admin123_adm
CREATE ROLE "admin_adm" WITH LOGIN SUPERUSER PASSWORD 'admin123_adm';

-- Otorgar todos los privilegios en la base de datos
GRANT ALL PRIVILEGES ON DATABASE "agenciaBd" TO "admin_adm";

-- Otorgar todos los privilegios en el esquema
GRANT ALL PRIVILEGES ON SCHEMA "privateSchema" TO "admin_adm";

-- Otorgar privilegios en todas las tablas
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA "privateSchema" TO "admin_adm";

-- Otorgar privilegios en todas las secuencias
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA "privateSchema" TO "admin_adm";

-- Asociar el usuario con el empleado ADMIN001
INSERT INTO "privateSchema".cuentas (idempleado, asociada) 
VALUES ('ADMIN001', 'admin123_adm');

-- =====================================================
-- VERIFICACIÓN
-- =====================================================

-- Verificar que el usuario fue creado
SELECT rolname, rolsuper, rolcanlogin 
FROM pg_roles 
WHERE rolname = 'admin_adm';

-- Verificar que la cuenta fue asociada al empleado
SELECT e.idempleado, e.nombre, e.apellidop, c.asociada
FROM "privateSchema".empleado e
JOIN "privateSchema".cuentas c ON e.idempleado = c.idempleado
WHERE c.asociada = 'admin123_adm';

-- =====================================================
-- CREDENCIALES PARA LA APLICACIÓN
-- =====================================================

\echo ''
\echo '============================================='
\echo 'Usuario administrador creado exitosamente'
\echo '============================================='
\echo 'Credenciales para iniciar sesión:'
\echo ''
\echo 'Usuario:    admin_adm'
\echo 'Contraseña: admin123_adm'
\echo ''
\echo 'IMPORTANTE: El sufijo _adm es necesario'
\echo 'para que la app abra el módulo de administrador'
\echo '============================================='
\echo ''
\echo 'Ahora puedes:'
\echo '1. Ejecutar la aplicación: java -jar dist/Agency.jar'
\echo '2. Iniciar sesión con las credenciales anteriores'
\echo '3. Crear más usuarios desde el módulo de administración'
\echo '============================================='
