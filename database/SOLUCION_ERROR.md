# 🔧 Solución al Error de Autenticación PostgreSQL

## ❌ Error Encontrado
```
FATAL: Peer authentication failed for user "postgres"
```

Este error ocurre porque PostgreSQL está configurado para usar autenticación "peer", que solo permite conexiones desde el usuario del sistema operativo que coincida con el usuario de PostgreSQL.

---

## ✅ SOLUCIÓN RÁPIDA (Recomendada)

Ejecutar la instalación como usuario `postgres`:

```bash
# 1. Cambiar al usuario postgres
sudo su - postgres

# 2. Navegar a la carpeta del proyecto
cd /home/chay/JavaDesktop/AgencyCar506/database

# 3. Ejecutar el script especial
./install_as_postgres.sh

# 4. Salir del usuario postgres cuando termine
exit
```

**¡Listo!** La base de datos estará instalada.

---

## 📝 OPCIÓN 2: Instalación Manual Paso a Paso

Si prefieres hacerlo paso a paso:

```bash
# 1. Cambiar al usuario postgres
sudo su - postgres

# 2. Crear la base de datos
psql -c "CREATE DATABASE \"agenciaBd\";"

# 3. Navegar a la carpeta del proyecto
cd /home/chay/JavaDesktop/AgencyCar506/database

# 4. Ejecutar script de inicialización
psql -d agenciaBd -f init_agenciaBd.sql

# 5. Crear usuario administrador
psql -d agenciaBd -f create_admin_user.sql

# 6. Verificar (opcional)
psql -d agenciaBd -f test_database.sql

# 7. Salir del usuario postgres
exit
```

---

## 🔐 OPCIÓN 3: Cambiar Configuración de PostgreSQL (Avanzado)

Si quieres que el script original funcione, puedes cambiar la autenticación a MD5:

### Paso 1: Editar archivo de configuración
```bash
sudo nano /etc/postgresql/*/main/pg_hba.conf
```

### Paso 2: Buscar esta línea:
```
local   all             postgres                                peer
```

### Paso 3: Cambiarla por:
```
local   all             postgres                                md5
```

### Paso 4: Guardar (Ctrl+O, Enter, Ctrl+X)

### Paso 5: Establecer contraseña para el usuario postgres
```bash
sudo su - postgres
psql
ALTER USER postgres WITH PASSWORD 'tu_password_aqui';
\q
exit
```

### Paso 6: Reiniciar PostgreSQL
```bash
sudo systemctl restart postgresql
```

### Paso 7: Ahora puedes usar el script original
```bash
cd /home/chay/JavaDesktop/AgencyCar506/database
./install.sh
# Cuando pida password, usa la que configuraste
```

---

## ⚡ OPCIÓN 4: Instalación Super Rápida (Una Línea)

```bash
sudo -u postgres bash -c "cd /home/chay/JavaDesktop/AgencyCar506/database && psql -c 'CREATE DATABASE agenciaBd;' && psql -d agenciaBd -f init_agenciaBd.sql && psql -d agenciaBd -f create_admin_user.sql"
```

Luego verifica que funcionó:
```bash
sudo -u postgres psql -d agenciaBd -c "SELECT COUNT(*) FROM \"privateSchema\".empleado;"
```

Deberías ver: `count = 1` (el empleado ADMIN001)

---

## 🎯 Verificar que la Instalación Funcionó

Después de instalar por cualquier método, verifica:

```bash
# Como usuario normal
sudo -u postgres psql -d agenciaBd -c "\dt \"privateSchema\".*"
```

Deberías ver 13 tablas listadas.

Para ver el usuario administrador creado:
```bash
sudo -u postgres psql -d agenciaBd -c "SELECT * FROM \"privateSchema\".cuentas;"
```

Deberías ver: `ADMIN001 | admin123_adm`

---

## ✅ Después de Instalar

Una vez que la base de datos esté lista:

```bash
# Ejecutar la aplicación
cd /home/chay/JavaDesktop/AgencyCar506
java -jar dist/Agency.jar

# Login con:
Usuario:    admin_adm
Contraseña: admin123_adm
```

---

## 🆘 Si Nada Funciona

Ejecuta estos comandos para obtener información de diagnóstico:

```bash
# Verificar estado de PostgreSQL
sudo systemctl status postgresql

# Ver versión
psql --version

# Ver configuración de autenticación
sudo cat /etc/postgresql/*/main/pg_hba.conf | grep -v "^#" | grep -v "^$"

# Listar bases de datos (como postgres)
sudo -u postgres psql -c "\l"
```

Comparte la salida de estos comandos si sigues teniendo problemas.

---

## 📞 Resumen de Scripts Disponibles

| Script | Para qué sirve | Cuándo usar |
|--------|---------------|-------------|
| `install.sh` | Instalación automática con sudo | PostgreSQL configurado con MD5 |
| `install_as_postgres.sh` | Instalación como usuario postgres | Cuando tienes el error "peer authentication" |
| Manual (comandos SQL) | Control total | Cuando los scripts no funcionan |

---

## 🎉 Recomendación Final

**USA LA OPCIÓN 1** (install_as_postgres.sh) - es la más simple y confiable:

```bash
sudo su - postgres
cd /home/chay/JavaDesktop/AgencyCar506/database
./install_as_postgres.sh
exit
```

**Total: 4 comandos y listo!** 🚀
