
## Mesa de trabajo.

 **Verificar .NET**

`dotnet --version`

si no :

```bash
sudo apt update
sudo apt install -y dotnet-sdk-8.0

```


**PASO 2: Crear WEB API**
creamos y nos hubicamos en al carpeta del proyecto.

```bash
dotnet new webapi

```
ese comando crea dentro de la carpeta del proyecto 2 puntos importantes
- dotnet: CLI principal de .NET para crear, compilar y ejecutar proyectos.
- new webapi: crea una plantilla base de ASP.NET Core Web API con servidor HTTP y Swagger.

`dotnet run`


## PASO 3: Instale Swagger
```BASH
dotnet add package Swashbuckle.AspNetCore
```


## Paso 4 — Abra Program.cs y reemplace todo su contenido por:

```csharp
var builder = WebApplication.CreateBuilder(args);

builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

var app = builder.Build();

if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

var summaries = new[]
{
    "Freezing", "Bracing", "Chilly", "Cool", "Mild", "Warm", "Balmy", "Hot", "Sweltering", "Scorching"
};

app.MapGet("/weatherforecast", () =>
{
    var forecast = Enumerable.Range(1, 5).Select(index =>
        new WeatherForecast
        (
            DateOnly.FromDateTime(DateTime.Now.AddDays(index)),
            Random.Shared.Next(-20, 55),
            summaries[Random.Shared.Next(summaries.Length)]
        ))
        .ToArray();
    return forecast;
})
.WithName("GetWeatherForecast");

app.Run();

record WeatherForecast(DateOnly Date, int TemperatureC, string? Summary)
{
    public int TemperatureF => 32 + (int)(TemperatureC / 0.5556);
}

```

## Paso 5 — Ejecute:
`dotnet run`

