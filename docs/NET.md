
- .NET es un programa que corre en un servidor, recibe peticiones HTTP, procesa lógica, y habla con una base de datos

## PROCESO

```
Cliente (browser/app)
        ↓  HTTP Request
   [Controller]        ← recibe la petición, delega
        ↓
   [Service]           ← contiene la lógica de negocio
        ↓
   [Repository]        ← habla con la base de datos
        ↓
   [SQL Server]        ← almacena los datos
        ↑
   [Respuesta sube por la misma cadena]

```
`Cada capa tiene una responsabilidad. Mezclarlas es técnicamente funcional y profesionalmente embarazoso`

## Como funciona



