#!/bin/bash

# =====================================================
# Script de Instalación Completa
# Base de Datos AgencyCar506
# =====================================================

echo ""
echo "============================================="
echo "INSTALACIÓN DE BASE DE DATOS AgencyCar506"
echo "============================================="
echo ""

# Colores para mensajes
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
NC='\033[0m' # No Color

# Verificar que PostgreSQL está instalado
if ! command -v psql &> /dev/null; then
    echo -e "${RED}ERROR: PostgreSQL no está instalado${NC}"
    echo "Por favor instala PostgreSQL primero:"
    echo "  - Ubuntu/Debian: sudo apt-get install postgresql postgresql-contrib"
    echo "  - CentOS/RHEL: sudo yum install postgresql-server postgresql-contrib"
    echo "  - macOS: brew install postgresql"
    exit 1
fi

echo -e "${GREEN}✓ PostgreSQL encontrado${NC}"
echo ""

# Obtener directorio del script
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
PROJECT_DIR="$(dirname "$SCRIPT_DIR")"

echo "Directorio del proyecto: $PROJECT_DIR"
echo ""

# Preguntar por el usuario de PostgreSQL
read -p "Usuario de PostgreSQL (por defecto: postgres): " PG_USER
PG_USER=${PG_USER:-postgres}

echo ""
echo -e "${YELLOW}Paso 1: Creando base de datos...${NC}"

# Intentar conectar primero para verificar autenticación
if ! sudo -u postgres psql -c "\l" > /dev/null 2>&1; then
    echo -e "${RED}✗ No se puede conectar a PostgreSQL con sudo${NC}"
    echo ""
    echo "SOLUCIONES:"
    echo "1. Ejecutar como usuario postgres:"
    echo "   sudo su - postgres"
    echo "   cd $SCRIPT_DIR"
    echo "   psql -c \"CREATE DATABASE agenciaBd;\""
    echo "   psql -d agenciaBd -f init_agenciaBd.sql"
    echo "   psql -d agenciaBd -f create_admin_user.sql"
    echo ""
    echo "2. O configurar autenticación MD5 en PostgreSQL:"
    echo "   sudo nano /etc/postgresql/*/main/pg_hba.conf"
    echo "   Cambiar 'peer' por 'md5' en la línea de postgres"
    echo "   sudo systemctl restart postgresql"
    echo ""
    echo "3. O usar la instalación manual (ver database/README.md)"
    exit 1
fi

# Crear la base de datos usando sudo -u postgres
sudo -u postgres psql -c "DROP DATABASE IF EXISTS \"agenciaBd\";" 2>/dev/null
sudo -u postgres psql -c "CREATE DATABASE \"agenciaBd\" WITH OWNER = postgres ENCODING = 'UTF8' LC_COLLATE = 'es_ES.UTF-8' LC_CTYPE = 'es_ES.UTF-8';" 2>/dev/null

if [ $? -eq 0 ]; then
    echo -e "${GREEN}✓ Base de datos creada${NC}"
else
    echo -e "${RED}✗ Error al crear base de datos${NC}"
    echo "Intentando con configuración regional alternativa..."
    sudo -u postgres psql -c "CREATE DATABASE \"agenciaBd\" WITH OWNER = postgres ENCODING = 'UTF8';"
    if [ $? -ne 0 ]; then
        echo -e "${RED}ERROR: No se pudo crear la base de datos${NC}"
        echo "Intenta la instalación manual (ver instrucciones arriba)"
        exit 1
    fi
    echo -e "${GREEN}✓ Base de datos creada con configuración alternativa${NC}"
fi

echo ""
echo -e "${YELLOW}Paso 2: Ejecutando script de inicialización...${NC}"

# Ejecutar el script de inicialización
sudo -u postgres psql -d agenciaBd -f "$SCRIPT_DIR/init_agenciaBd.sql" > /dev/null 2>&1

if [ $? -eq 0 ]; then
    echo -e "${GREEN}✓ Estructura de base de datos creada${NC}"
else
    echo -e "${RED}✗ Error al ejecutar script de inicialización${NC}"
    exit 1
fi

echo ""
echo -e "${YELLOW}Paso 3: Creando usuario administrador...${NC}"

# Ejecutar script de creación de usuario admin
sudo -u postgres psql -d agenciaBd -f "$SCRIPT_DIR/create_admin_user.sql" > /dev/null 2>&1

if [ $? -eq 0 ]; then
    echo -e "${GREEN}✓ Usuario administrador creado${NC}"
else
    echo -e "${RED}✗ Error al crear usuario administrador${NC}"
    echo "Puedes crearlo manualmente ejecutando: database/create_admin_user.sql"
fi

echo ""
echo -e "${YELLOW}Paso 4: Verificando instalación...${NC}"

# Ejecutar script de pruebas
sudo -u postgres psql -d agenciaBd -f "$SCRIPT_DIR/test_database.sql" > /tmp/db_test_result.txt 2>&1

if grep -q "ERROR" /tmp/db_test_result.txt; then
    echo -e "${RED}✗ Se encontraron errores durante la verificación${NC}"
    echo "Revisa el archivo /tmp/db_test_result.txt para más detalles"
else
    echo -e "${GREEN}✓ Verificación exitosa${NC}"
fi

# Limpiar archivo temporal
rm -f /tmp/db_test_result.txt

echo ""
echo "============================================="
echo -e "${GREEN}INSTALACIÓN COMPLETADA${NC}"
echo "============================================="
echo ""
echo "Credenciales de acceso:"
echo "  Usuario:    admin_adm"
echo "  Contraseña: admin123_adm"
echo ""
echo "Cómo usar la aplicación:"
echo "  1. cd $PROJECT_DIR"
echo "  2. java -jar dist/Agency.jar"
echo "  3. Inicia sesión con las credenciales anteriores"
echo ""
echo "IMPORTANTE:"
echo "  - El sufijo del usuario (_adm) determina el módulo que se abre"
echo "  - Puedes crear más usuarios desde la aplicación"
echo "  - Consulta database/README.md para más información"
echo ""
echo "============================================="
echo ""
