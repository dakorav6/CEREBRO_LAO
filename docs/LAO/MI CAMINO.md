# GUÍA DE DESARROLLO BACKEND

---

## PILAR 1 — BASES DE DATOS

El más importante. Aquí también vive el análisis de datos porque comparten el mismo territorio.

---

### Bases de Datos Relacionales

**Tecnología principal:** PostgreSQL + DBeaver

PostgreSQL es tu base de datos para los tres lenguajes de tu ruta:
- Con Python: `psycopg2` y `SQLAlchemy`
- Con JavaScript/TypeScript: `Prisma` o `TypeORM`
- Con C#: `Entity Framework Core`

**Temas SQL:**
- CRUD: `INSERT`, `SELECT`, `UPDATE`, `DELETE`
- JOINs: `INNER`, `LEFT`, `RIGHT`
- Agregaciones: `SUM`, `AVG`, `COUNT`, `MIN`, `MAX`
- Transacciones: `BEGIN`, `COMMIT`, `ROLLBACK`
- Restricciones: `NOT NULL`, `UNIQUE`, `CHECK`, `FOREIGN KEY`
- Índices y optimización de consultas
- Vistas, procedimientos almacenados, triggers
- Window Functions: `RANK()`, `OVER()`
- Modelado: entidades, relaciones, normalización
- Diagramas entidad-relación (ERD)
- Sharding y replicación de datos (nivel avanzado)
- ACID: Atomicidad, Consistencia, Aislamiento, Durabilidad

---

### Bases de Datos No Relacionales (NoSQL)

> Por qué MongoDB y no solo PostgreSQL: El mundo real mezcla ambos tipos. Hay proyectos donde los datos no tienen una estructura fija, cambian constantemente o necesitan escalar horizontalmente con facilidad. MongoDB cubre esos casos. Además, el mercado remoto internacional usa ambos y esperan que sepas los dos.

**Tecnología principal:** MongoDB

MongoDB se conecta a los tres lenguajes de tu ruta:
- Con Python: `PyMongo` o `Motor` (asíncrono)
- Con JavaScript/TypeScript: `Mongoose`
- Con C#: `MongoDB .NET Driver`

**Temas NoSQL:**
- Diferencias fundamentales entre SQL y NoSQL: cuándo usar cada uno
- Modelado de documentos en lugar de tablas
- CRUD en MongoDB: `find`, `insertOne`, `updateOne`, `deleteOne`
- Agregaciones con el Aggregation Pipeline
- Índices en MongoDB
- Relaciones entre documentos: embedding vs referencing
- Casos de uso reales: catálogos, logs, sesiones, datos en tiempo real

**Otros tipos NoSQL que debes conocer conceptualmente:**
- **Redis** — Clave-valor en memoria. Para caché y sesiones. Está en tu Pilar 4
- **Firebase** — Tiempo real y serverless. Útil en proyectos personales rápidos

---

### Análisis de Datos Básico (vive en este pilar)
- SQL avanzado para análisis: agregaciones complejas, vistas analíticas
- Pandas y NumPy: limpiar y transformar Excel/CSV desde Python
- ETL básico: extraer de Excel, transformar con Python, cargar a PostgreSQL
- Power BI: visualización sin código, muy pedido en empresas locales

---

## PILAR 2 — LENGUAJES BACKEND

Tres lenguajes. En este orden estricto.

---

### 1. Python — Tu lenguaje principal

> Por qué primero: Cubre Backend, datos, automatización e IA con un solo lenguaje. Es donde construyes tus primeros proyectos.

**Temas del lenguaje:**
- Sintaxis, funciones, módulos, manejo de errores y excepciones
- POO: clases, herencia, encapsulamiento, polimorfismo
- Decoradores, generadores, context managers
- Librerías estándar: `os`, `sys`, `datetime`

**Frameworks y librerías:**
- **FastAPI** — Framework principal para APIs REST. Moderno, rápido, tipado. Genera documentación Swagger automática
- **SQLAlchemy** — ORM para conectar Python con PostgreSQL
- **PyMongo / Motor** — Conectores para MongoDB desde Python
- **Pydantic** — Validación de datos, viene integrado con FastAPI
- **Django** — Lo estudias después de FastAPI. Framework completo con panel de administración, ORM propio y autenticación incluida
- **Pandas / NumPy** — Para el análisis de datos del Pilar 1
- **bcrypt / Passlib** — Seguridad de contraseñas
- **slowapi** — Rate limiting para FastAPI

**Base de datos con Python:**
- Relacional: PostgreSQL con `psycopg2` y `SQLAlchemy`
- No relacional: MongoDB con `PyMongo` o `Motor`

---

### 2. JavaScript / TypeScript — Mercado remoto internacional

> Por qué segundo y no C#: Con un solo lenguaje cubres backend con Node.js y frontend con React. Domina el mercado remoto de startups en EE.UU. y Europa.

**Temas del lenguaje:**
- JavaScript moderno: ES6+, Promises, async/await
- TypeScript: tipos estáticos, interfaces, clases, generics
- Manipulación del DOM para el frontend mínimo
- Node.js: módulos, manejo de rutas, servidores HTTP, NPM

**Frameworks Backend:**
- **NestJS** — Framework estructurado para APIs en TypeScript. Arquitectura similar a Angular, lo que lo hace predecible y escalable. Lo que usan empresas serias
- **Express.js** — Lo conoces porque NestJS está construido encima de él. Más simple, menos estructura

**ORMs y conectores:**
- **Prisma** — ORM moderno para TypeScript. Conecta con PostgreSQL y MongoDB
- **TypeORM** — Alternativa a Prisma, más parecido a SQLAlchemy
- **Mongoose** — ODM para MongoDB con Node.js

**Base de datos con JavaScript/TypeScript:**
- Relacional: PostgreSQL con `Prisma` o `TypeORM`
- No relacional: MongoDB con `Mongoose`

**Frontend mínimo:**
- **React** — Componentes funcionales, hooks: `useState`, `useEffect`, llamadas a tu API con `fetch` o `axios`
- **Next.js** — Encima de React cuando necesites SEO en proyectos públicos
- **Tailwind CSS** — Diseño sin escribir CSS desde cero

> Cuándo lo estudias: Cuando tengas un proyecto completo en Python funcionando.

---

### 3. C# — Mercado corporativo local

> Por qué tercero: Bancos ecuatorianos, SAP Business One, empresas grandes locales. Si decides ir por ese camino, C# es la llave. No antes.

**Temas del lenguaje:**
- Sintaxis y estructuras de control
- POO en C#: clases, interfaces, herencia, polimorfismo
- Programación asincrónica con `async/await`
- LINQ: consultas integradas en el lenguaje

**Frameworks Backend:**
- **ASP.NET Core** — Framework principal para APIs REST en C#
- **Minimal APIs** — Forma moderna y ligera de construir APIs en .NET, similar a FastAPI

**ORMs y conectores:**
- **Entity Framework Core** — ORM oficial de .NET. Conecta con PostgreSQL y SQL Server
- **MongoDB .NET Driver** — Conector oficial para MongoDB desde C#
- **Dapper** — ORM ligero para cuando necesitas control total del SQL

**Base de datos con C#:**
- Relacional: PostgreSQL con `Entity Framework Core` o `Dapper`
- No relacional: MongoDB con `MongoDB .NET Driver`

**Testing y nube:**
- **xUnit** — Pruebas unitarias en C#
- **Azure** — La nube natural de este lenguaje

> Cuándo lo estudias: Cuando los 3 proyectos de portafolio estén terminados.

---

## PILAR 3 — BACKEND, APIs Y SEGURIDAD

Van juntos porque la seguridad no es un módulo aparte. Es parte de cómo diseñas una API desde el primer día.

---

### Diseño de APIs REST

**Conceptos:**
- Cómo funciona HTTP: métodos `GET`, `POST`, `PUT`, `DELETE`, `PATCH`
- Códigos de respuesta: 200, 201, 400, 401, 403, 404, 500
- Diseño coherente y predecible de endpoints
- Versionado de rutas desde el inicio: `/api/v1/recurso`
- Manejo estructurado de errores: mensajes genéricos al usuario, detalles en logs internos

**Tecnologías:**
- **Postman** — Probar y documentar tus endpoints
- **Swagger / OpenAPI** — FastAPI lo genera automáticamente. Documentación interactiva de tu API
- **Insomnia** — Alternativa a Postman, más ligera

---

### Seguridad Backend

**Conceptos:**
- OWASP Top 10: los 10 errores más comunes que abren vulnerabilidades
- Nunca confiar en los datos que manda el cliente
- Mostrar errores genéricos al usuario, guardar detalles en logs

**Tecnologías por lenguaje:**

Con Python:
- `bcrypt` o `Passlib` — Hashing de contraseñas
- `python-jose` — JWT en Python
- `slowapi` — Rate limiting

Con JavaScript/TypeScript:
- `bcrypt` — Hashing de contraseñas en Node.js
- `jsonwebtoken` — JWT en Node.js
- `helmet` — Headers de seguridad en Express/NestJS
- `express-rate-limit` — Rate limiting

Con C#:
- `ASP.NET Core Identity` — Autenticación y autorización integrada
- `Microsoft.AspNetCore.Authentication.JwtBearer` — JWT en .NET

**Temas de seguridad transversales (aplican a todos los lenguajes):**
- Hashing de contraseñas: nunca guardar en texto plano
- JWT (JSON Web Tokens): autenticación sin estado
- OAuth2: estándar de autorización
- CORS: definir quién puede consumir tu API
- HTTPS y SSL/TLS básico
- Prevención de inyección SQL
- Rate Limiting: limitar peticiones por usuario
- CSP (Content Security Policy)

---

### Arquitectura (se absorbe con la práctica, no de golpe)

**Conceptos:**
- Principios SOLID
- Clean Code
- Clean Architecture básica
- Patrones de diseño esenciales: Repository, Factory, Singleton
- System Design: cómo fluye la información entre APIs, bases de datos y servicios externos
- Monolito primero, microservicios después cuando el problema lo justifique

---

## PILAR 4 — HERRAMIENTAS PROFESIONALES

Sin esto no trabajas en equipo ni en remoto.

| Herramienta | Para qué sirve | Cuándo la aprendes |
|-------------|---------------|-------------------|
| Git + GitHub | Control de versiones y portafolio público | Desde el primer día |
| Postman | Probar y documentar tus APIs | Cuando hagas tu primera API |
| DBeaver | Administrar PostgreSQL y MongoDB visualmente | Cuando instales la base de datos |
| Docker | Empaquetar tu aplicación para cualquier entorno | Al terminar el primer proyecto |
| Terminal / Linux básico | Moverse en servidores remotos, comandos esenciales | Paralelo desde el inicio |
| Redis | Caché en memoria para hacer tu API más rápida | En el Proyecto 2 o 3 |
| Inglés técnico | Leer documentación oficial y conseguir trabajo remoto | 15 minutos diarios, siempre |

---

## PROYECTOS DE PORTAFOLIO

Estos no son ejercicios. Son productos. Cada uno va a GitHub con README claro.

### Proyecto 1 — Sistema de clientes con autenticación
- **Stack:** Python + FastAPI + PostgreSQL + React básico
- **Qué demuestra:** API REST completa, base de datos relacional, seguridad con JWT, frontend mínimo funcional

### Proyecto 2 — API de análisis de gastos desde archivo
- **Stack:** Python + FastAPI + Pandas + PostgreSQL
- **Qué demuestra:** Backend integrado con análisis de datos, proceso ETL real, endpoints que devuelven estadísticas

### Proyecto 3 — ERP light con roles, auditoría y contenedores
- **Stack:** Python + FastAPI + PostgreSQL + MongoDB + React + Docker
- **Qué demuestra:** Arquitectura real, roles de usuario, lógica de negocio compleja, log de auditoría, uso de SQL y NoSQL en el mismo sistema, aplicación desplegable

---

## LO QUE NO ENTRA TODAVÍA

Kubernetes, microservicios, RabbitMQ, Kafka, GraphQL, WebSockets, Go, apps móviles nativas.

No porque sean inútiles. Porque tienes 12 horas semanales y dos hijos. El enfoque es tu única ventaja real contra alguien que estudia 8 horas diarias.

---

## EVOLUCIÓN — El siguiente nivel

```
Ahora          →  Año 1-2   →  Año 2-3   →  Año 3-5   →  Año 5+
Pilares base      Proyectos    Senior        Cloud/AI      Especialista
+ portafolio      + trabajo    Backend       Engineer      o Arquitecto
                  local
```

### Nivel 2 — Ingeniero Backend Senior
- Microservicios y comunicación entre servicios
- Domain Driven Design (DDD)
- Event Sourcing y CQRS
- Message Brokers: RabbitMQ o Kafka
- WebSockets para tiempo real
- Observabilidad: monitoreo, logging estructurado, métricas con Grafana

### Nivel 3 — Cloud / DevOps Engineer
- AWS o Azure a nivel profesional con certificación
- Kubernetes para orquestación de contenedores
- Infraestructura como código con Terraform
- CI/CD avanzado con GitHub Actions
- Serverless: Lambda en AWS, Azure Functions

### Nivel 4 — Especialización (escoges uno)

**Ruta A — AI/ML Engineer**
Python + integración de LLMs en APIs propias + LangChain. El perfil más buscado en el mercado actual.

**Ruta B — Cloud Architect**
Diseño de infraestructura completa para sistemas grandes. Uno de los perfiles mejor pagados de la industria.

---

> El trabajo remoto internacional entra realísticamente en el Año 2 o 3, cuando tienes experiencia laboral real detrás de los proyectos. El inglés es el cuello de botella más grande para ese objetivo. Más que cualquier tecnología.