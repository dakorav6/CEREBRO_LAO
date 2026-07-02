
# Mesa de trabajo

**Paso 1 — Verifique que Docker esté disponible:**
`docker --version`


**Paso 2 — Descargue y ejecute el contenedor:**
```bash
docker run -e "ACCEPT_EULA=Y" \
  -e "MSSQL_SA_PASSWORD=YourStrong!Passw0rd" \
  -p 1433:1433 \
  --name sqlserver \
  -d mcr.microsoft.com/mssql/server:2022-latest

```
- ACCEPT_EULA=Y: obligatorio, acepta la licencia.
- MSSQL_SA_PASSWORD: la contraseña del usuario administrador sa. Debe tener mayúscula, minúscula, número y símbolo, o el contenedor rechaza el arranque.
- p 1433:1433: expone el puerto de SQL Server hacia su Codespace.

`para ver los contenedores ya instalados se usa comando : docker images`

`Listar los contenedores creados a partir de esa imagen(incluyendo los detenidos): docker ps -a`

Inícielo y revise si levanta bien:
`docker start sqlserver`

Luego, para confirmar que no vuelve a caer inmediatamente

`docker ps -a`

EXTENCION RECOMENDAD: "SQL Server (mssql)"


## Para trabajar con la base de datos desde su proyecto .NET necesita tres cosas: el paquete de Entity Framework, la cadena de conexión, y un DbContext. Vamos paso a paso.

**Paso 1 — Instalar los paquetes necesarios**
Desde la terminal, en la carpeta de su proyecto:
```bash
dotnet add package Microsoft.EntityFrameworkCore.SqlServer
dotnet add package Microsoft.EntityFrameworkCore.Design
```

**Paso 2 — Configurar la cadena de conexión**

En appsettings.json:

```json
{
  "Logging": {
    "LogLevel": {
      "Default": "Information",
      "Microsoft.AspNetCore": "Warning"
    }
  },
  "AllowedHosts": "*",
  "ConnectionStrings": {
    "DefaultConnection": "Server=localhost,1433;Database=TareaDb;User Id=sa;Password=SU_PASSWORD_AQUI;TrustServerCertificate=True"
  }
}
```
Reemplace SU_PASSWORD_AQUI por la misma contraseña que puso en MSSQL_SA_PASSWORD cuando creó el contenedor.
