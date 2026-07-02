# SQL Server en Docker dentro del Codespace

**1. Verificar Docker:** `docker --version`

**2. Descargar imagen de SQL Server para Docker:**`docker pull mcr.microsoft.com/mssql/server:2022-latest`
>Docker trabaja con imágenes y contenedores.
> - que es una imagen? , una plantilla inmutable que contiene:sistemas, configuración y aplicación.
>- en este caso: `mcr.microsoft.com/mssql/server:2022-latest` contiene: Linux , SQL Server instalado y configuración mínima para arrancar
>- Cuando haces: `docker run ...` Docker crea un contenedor basado en esa imagen.

**Estados del DOCKER**
1. Ejecutándose: docker ps  
2. Detenido `docker stop sqlserver`
- Ver TODOS los contenedores `docker ps -a`



**3. Crear contenedor SQL Server**
```bash
docker run -e "ACCEPT_EULA=Y" \
-e "MSSQL_SA_PASSWORD=Password123!" \
-p 1433:1433 \
--name sqlserver \
-d mcr.microsoft.com/mssql/server:2022-latest
```

**Qué hace esto**
- ACCEPT_EULA=Y (Microsoft obligándote a aceptar términos antes de respirar.)
- MSSQL_SA_PASSWORD  (contraseña del usuario sa.)
- p 1433:1433  (expone el puerto SQL Server.)
- name sqlserver (nombre del contenedor.)
- d (modo background.)


**4. Verificar que SQL Server corre:** `docker ps`


**5. Instalar extensión SQL Server en VS Code:** SQL Server (mssql)

**6. Conectarse desde VS Code**

- Campo:Valor
- Server:localhost
- User:sa
- Password:Password123!
- Port:1433

**7. Crear base de datos**

Desde terminal:

```bash
docker exec -it sqlserver /opt/mssql-tools/bin/sqlcmd \
-S localhost -U sa -P 'Password123!' \
-Q "CREATE DATABASE TaskDb"

```







