#!/bin/bash

# =====================================================
# Script de Instalación Manual Simple
# Para ejecutar como usuario postgres
# =====================================================

echo ""
echo "============================================="
echo "INSTALACIÓN MANUAL - AgencyCar506"
echo "============================================="
echo ""
echo "Este script debe ejecutarse COMO USUARIO POSTGRES"
echo "Ejecuta primero: sudo su - postgres"
echo "Luego navega a: cd /home/chay/JavaDesktop/AgencyCar506/database"
echo "Y ejecuta: ./install_as_postgres.sh"
echo ""

# Verificar que estamos corriendo como postgres
if [ "$(whoami)" != "postgres" ]; then
    echo "ERROR: Este script debe ejecutarse como usuario postgres"
    echo ""
    echo "Ejecuta:"
    echo "  sudo su - postgres"
    echo "  cd $(pwd)"
    echo "  ./install_as_postgres.sh"
    echo ""
    exit 1
fi

echo "✓ Usuario postgres confirmado"
echo ""

# Obtener directorio del script
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

echo "Paso 1: Creando base de datos..."
psql -c "DROP DATABASE IF EXISTS \"agenciaBd\";" 2>/dev/null
psql -c "CREATE DATABASE \"agenciaBd\" WITH ENCODING = 'UTF8';"

if [ $? -eq 0 ]; then
    echo "✓ Base de datos creada"
else
    echo "✗ Error al crear base de datos"
    exit 1
fi

echo ""
echo "Paso 2: Ejecutando script de inicialización..."
psql -d agenciaBd -f "$SCRIPT_DIR/init_agenciaBd.sql" > /dev/null 2>&1

if [ $? -eq 0 ]; then
    echo "✓ Estructura de base de datos creada"
else
    echo "✗ Error al ejecutar script de inicialización"
    exit 1
fi

echo ""
echo "Paso 3: Creando usuario administrador..."
psql -d agenciaBd -f "$SCRIPT_DIR/create_admin_user.sql" > /dev/null 2>&1

if [ $? -eq 0 ]; then
    echo "✓ Usuario administrador creado"
else
    echo "✗ Error al crear usuario administrador"
fi

echo ""
echo "Paso 4: Verificando instalación..."
psql -d agenciaBd -f "$SCRIPT_DIR/test_database.sql" > /tmp/db_test_result.txt 2>&1

if grep -q "ERROR" /tmp/db_test_result.txt; then
    echo "✗ Se encontraron errores durante la verificación"
else
    echo "✓ Verificación exitosa"
fi

rm -f /tmp/db_test_result.txt

echo ""
echo "============================================="
echo "INSTALACIÓN COMPLETADA"
echo "============================================="
echo ""
echo "Credenciales de acceso:"
echo "  Usuario:    admin_adm"
echo "  Contraseña: admin123_adm"
echo ""
echo "Para salir del usuario postgres: exit"
echo "Para ejecutar la app: java -jar dist/Agency.jar"
echo ""
echo "============================================="
echo ""
