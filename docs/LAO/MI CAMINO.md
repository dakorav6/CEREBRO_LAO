# GUÍA DE DESARROLLO BACKEND

---

## PILAR 1 — BASES DE DATOS

El pilar más importante. Sin datos no hay backend.

---

### Base de Datos Principal — PostgreSQL (Relacional)

**Herramienta visual:** DBeaver

**Conectores por lenguaje:**
- Python: `psycopg2` y `SQLAlchemy`
- JavaScript/TypeScript: `Prisma` o `TypeORM`
- C#: `Entity Framework Core` o `Dapper`

**Temas:**
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
- ACID: Atomicidad, Consistencia, Aislamiento, Durabilidad
- Sharding y replicación (nivel avanzado)

---

### Base de Datos Secundaria — MongoDB (No Relacional)

**Por qué MongoDB como segunda base de datos:**
PostgreSQL maneja datos con estructura fija y relaciones claras. MongoDB maneja datos flexibles, que cambian de forma, o que necesitan escalar horizontalmente. El mercado real usa ambos. Un backend que solo conoce uno tiene un hueco visible en cualquier entrevista. Entre las opciones NoSQL, MongoDB es la más demandada, la mejor documentada y la que más aparece en vacantes de trabajo remoto.

**Conectores por lenguaje:**
- Python: `PyMongo` o `Motor` (asíncrono)
- JavaScript/TypeScript: `Mongoose`
- C#: `MongoDB .NET Driver`

**Temas:**
- Modelado de documentos en lugar de tablas
- CRUD: `find`, `insertOne`, `updateOne`, `deleteOne`
- Aggregation Pipeline
- Índices en MongoDB
- Embedding vs referencing entre documentos
- Casos de uso: catálogos, logs, sesiones, datos en tiempo real

---

### Análisis de Datos Básico (complemento de este pilar)

- SQL avanzado para análisis: agregaciones complejas, vistas analíticas
- Pandas y NumPy: limpiar y transformar Excel/CSV desde Python
- ETL básico: extraer de Excel, transformar con Python, cargar a PostgreSQL
- Power BI: visualización sin código, muy pedido en empresas locales

---

## PILAR 2 — PROGRAMACIÓN BACKEND

### Prerequisitos — Base común a los tres lenguajes

Estos temas los estudias una vez, aplican a todos los lenguajes. No los repitas por cada uno.

**Lógica y algoritmos:**
- Variables, tipos de datos, operadores
- Condicionales y bucles
- Funciones y módulos
- Manejo de errores y excepciones
- Algoritmos básicos de ordenamiento y búsqueda
- Estructuras de datos: listas, pilas, colas, diccionarios, conjuntos

**Programación Orientada a Objetos (POO):**
- Clases y objetos
- Herencia y polimorfismo
- Encapsulamiento y abstracción
- Interfaces y clases abstractas

**Programación asincrónica:**
- Qué es la concurrencia y por qué importa en backend
- Promises y async/await (el concepto aplica igual en los tres lenguajes)
- Manejo de errores en operaciones asíncronas

---

### Lenguaje 1 — Python

> Por qué primero: cubre Backend, datos e IA con un solo lenguaje. Es donde construyes todos tus proyectos iniciales.

**Lo específico de Python (lo general ya está en prerequisitos):**
- Sintaxis y tipado dinámico
- Decoradores, generadores, context managers
- Librerías estándar: `os`, `sys`, `datetime`
- Type Hints: tipado opcional que FastAPI usa para validar datos

**Frameworks Backend:**
- **FastAPI** — Tu framework principal. APIs REST modernas, tipadas, con Swagger automático
- **Django** — Lo estudias después. Framework completo con panel de administración y ORM propio

**Librerías clave:**
- `SQLAlchemy` — ORM para PostgreSQL
- `PyMongo` / `Motor` — Conectores para MongoDB
- `Pydantic` — Validación de datos, integrado con FastAPI
- `bcrypt` / `Passlib` — Hashing de contraseñas
- `python-jose` — JWT
- `slowapi` — Rate limiting

---

### Lenguaje 2 — JavaScript / TypeScript

> Por qué segundo: cubre backend con Node.js y frontend con React. Domina el mercado remoto internacional.

**Lo específico de JS/TS (lo general ya está en prerequisitos):**
- JavaScript moderno: ES6+, destructuring, spread operator
- TypeScript: tipos estáticos, interfaces, generics
- Node.js: módulos, NPM, servidores HTTP
- Manipulación del DOM (para el frontend mínimo)

**Frameworks Backend:**
- **NestJS** — Framework estructurado para APIs en TypeScript. Lo que usan empresas serias
- **Express.js** — Base de NestJS. Lo conoces por contexto

**ORMs y conectores:**
- `Prisma` — ORM moderno para PostgreSQL y MongoDB
- `Mongoose` — ODM para MongoDB

**Frontend mínimo (solo lo necesario para que tus proyectos tengan pantalla):**
- **React** — Componentes funcionales, `useState`, `useEffect`, llamadas a tu API
- **Next.js** — Encima de React cuando necesites SEO en proyectos públicos
- **Tailwind CSS** — Diseño sin escribir CSS desde cero


---

### Lenguaje 3 — C#


**Lo específico de C# (lo general ya está en prerequisitos):**
- Tipado estático y estricto
- LINQ: consultas integradas en el lenguaje
- Namespaces y estructura de proyectos .NET

**Frameworks Backend:**
- **ASP.NET Core** — Framework principal para APIs REST en C#
- **Minimal APIs** — Forma moderna y ligera, similar a FastAPI

**ORMs y conectores:**
- `Entity Framework Core` — ORM oficial, conecta con PostgreSQL
- `Dapper` — ORM ligero para control total del SQL
- `MongoDB .NET Driver` — Conector oficial para MongoDB

**Testing y nube:**
- `xUnit` — Pruebas unitarias
- **Azure** — La nube natural de este lenguaje

> Cuándo: cuando los 3 proyectos de portafolio estén terminados.

---

## PILAR 3 — APIs Y SEGURIDAD

La seguridad no es un módulo aparte. Es parte del diseño desde el primer endpoint.

---

### Diseño de APIs REST

**Conceptos:**
- HTTP: métodos `GET`, `POST`, `PUT`, `DELETE`, `PATCH`
- Códigos de respuesta: 200, 201, 400, 401, 403, 404, 500
- Diseño coherente de endpoints
- Versionado desde el inicio: `/api/v1/recurso`
- Errores genéricos al usuario, detalles técnicos solo en logs internos

**Tecnologías:**
- **Postman** o **Insomnia** — Probar y documentar endpoints
- **Swagger / OpenAPI** — FastAPI lo genera automáticamente

---

### Seguridad Backend

**Conceptos transversales (aplican a los tres lenguajes):**
- OWASP Top 10
- Hashing de contraseñas: nunca en texto plano
- JWT: autenticación sin estado
- OAuth2: estándar de autorización
- CORS: definir quién consume tu API
- HTTPS y SSL/TLS básico
- Validación estricta de inputs: nunca confiar en lo que el usuario manda
- Prevención de inyección SQL
- Rate Limiting: limitar peticiones para que nadie tumbe tu API
- CSP (Content Security Policy)

**Librerías por lenguaje** (referencia rápida):

| Concepto | Python | JS/TS | C# |
|----------|--------|-------|----|
| Hashing | `bcrypt` / `Passlib` | `bcrypt` | `ASP.NET Core Identity` |
| JWT | `python-jose` | `jsonwebtoken` | `JwtBearer` |
| Rate Limiting | `slowapi` | `express-rate-limit` | Middleware custom |
| Headers seguridad | — | `helmet` | Middleware integrado |

---

### Arquitectura (se absorbe con la práctica)

- Principios SOLID
- Clean Code
- Clean Architecture básica
- Patrones: Repository, Factory, Singleton
- System Design: cómo fluye la información entre servicios
- Monolito primero. Microservicios cuando el problema lo justifique

---

## PILAR 4 — HERRAMIENTAS PROFESIONALES

Sin esto no trabajas en equipo ni en remoto.

| Herramienta | Para qué | Cuándo |
|-------------|----------|--------|
| Git + GitHub | Control de versiones y portafolio | Desde el primer día |
| Postman / Insomnia | Probar APIs | Primera API |
| DBeaver | Administrar PostgreSQL y MongoDB | Al instalar la base de datos |
| Docker | Empaquetar la aplicación | Al terminar el primer proyecto |
| Terminal / Linux básico | Servidores remotos | Paralelo desde el inicio |
| Redis | Caché en memoria | Proyecto 2 o 3 |
| Inglés técnico | Documentación y trabajo remoto | 15 minutos diarios, siempre |

---

## PROYECTOS DE PORTAFOLIO

No son ejercicios. Son productos. Cada uno va a GitHub con README.

### Proyecto 1 — Sistema de clientes con autenticación
- **Stack:** Python + FastAPI + PostgreSQL + React básico
- **Demuestra:** API REST, base de datos relacional, JWT, frontend funcional

### Proyecto 2 — API de análisis de gastos
- **Stack:** Python + FastAPI + Pandas + PostgreSQL
- **Demuestra:** Backend + ETL + análisis de datos integrado

### Proyecto 3 — ERP light con roles y auditoría
- **Stack:** Python + FastAPI + PostgreSQL + MongoDB + React + Docker
- **Demuestra:** Arquitectura real, roles, lógica de negocio, SQL y NoSQL juntos, contenedores



---

## EVOLUCIÓN — El siguiente nivel

### Nivel 2 — Backend Senior
- Microservicios, DDD, Event Sourcing, CQRS
- Message Brokers: RabbitMQ o Kafka
- WebSockets para tiempo real
- Observabilidad: monitoreo y métricas con Grafana

### Nivel 3 — Cloud / DevOps
- AWS o Azure con certificación
- Kubernetes, Terraform
- CI/CD avanzado con GitHub Actions
- Serverless: Lambda, Azure Functions

### Nivel 4 — Especialización

**Ruta A — AI Engineer:** Python + LLMs + LangChain integrado en APIs propias. El perfil más buscado hoy.

**Ruta B — Cloud Architect:** Infraestructura completa para sistemas grandes. Uno de los perfiles mejor pagados.

-