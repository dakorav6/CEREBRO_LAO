# Temario Backend Developer — Organizado por Pilares

## FUENTES DE PRÁCTICA Y CONOCIMIENTO

### Backend y ruta general
- **[roadmap.sh](https://roadmap.sh/dashboard)** — Rutas visuales, recursos curados y proyectos prácticos para backend developer. Tu brújula durante todo el camino.

### Para proyectos reales guiados
- **[The Odin Project](https://www.theodinproject.com)** — Currículo open source con proyectos reales de principio a fin.
- **[Full Stack Open](https://fullstackopen.com/es)** — De la Universidad de Helsinki. Gratuito, en español parcialmente. Cubre Node.js, React y bases de datos.

### Para practicar código y algoritmos
- **[LeetCode](https://leetcode.com)** — Problemas de lógica y algoritmos. Muy usado en entrevistas técnicas de trabajo remoto. Empieza con nivel "Easy".
- **[HackerRank](https://www.hackerrank.com)** — Tracks específicos por lenguaje (Python, JS, SQL). Ideal para principiantes.

### Para practicar SQL específicamente
- **[SQLZoo](https://sqlzoo.net/wiki/SQL_Tutorial)** — Ejercicios interactivos de SQL en el navegador, sin instalar nada.
- **[Mode SQL Tutorial](https://www.thoughtspot.com/sql-tutorial)** — Muy bueno para SQL analítico: window functions, CTEs y agregaciones complejas.

### Para ciencia de Datos 

- **Kaggle** : es la plataforma más grande del mundo para entusiastas y profesionales de la ciencia de datos y el aprendizaje automático (machine learning). Propiedad de Google, funciona como una red social, un centro de aprendizaje y un campo de batalla para resolver problemas complejos mediante datos.


---

## PILAR 0 — Lógica y Fundamentos
> Base transversal. Se estudia una vez y aplica a todos los lenguajes. No la repitas por cada uno.

### Lógica y algoritmos
- Variables, tipos de datos y operadores
- Condicionales (if/else) y bucles (for/while)
- Funciones y módulos
- Manejo de errores y excepciones
- Algoritmos básicos de ordenamiento y búsqueda
- Estructuras de datos: listas, pilas, colas, diccionarios, conjuntos

### Programación Orientada a Objetos (POO)
- Clases y objetos
- Herencia y polimorfismo
- Encapsulamiento y abstracción
- Interfaces y clases abstractas

### Programación asincrónica
- Qué es la concurrencia y por qué importa en backend
- Promises y async/await (el concepto aplica igual en los tres lenguajes)
- Manejo de errores en operaciones asíncronas

**Herramientas:** `Python (práctica)` · `VS Code` · `Git (desde el primer día)`

---

## PILAR 1 — Bases de Datos

### PostgreSQL — Relacional Principal
> Tu base de datos principal en todos los proyectos.

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
- Vistas y procedimientos almacenados
- **Triggers:** `BEFORE` vs `AFTER`, `FOR EACH ROW`, casos reales de auditoría y validación automática
- Window Functions: `RANK()`, `ROW_NUMBER()`, `OVER()`
- CTEs — Common Table Expressions
- Modelado: entidades, relaciones, normalización
- Diagramas entidad-relación (ERD)
- ACID: Atomicidad, Consistencia, Aislamiento, Durabilidad
- Sharding y replicación *(nivel avanzado)*

---

### SQL Server — Relacional Secundaria
> El motor natural del ecosistema Microsoft. Si estudias C# y apuntas a trabajo remoto enterprise, SQL Server aparece en casi todas las vacantes .NET.

**Por qué SQL Server y no MySQL:** MySQL nació en el ecosistema PHP/WordPress (stack LAMP). SQL Server en cambio vive en el mismo ecosistema que C#, ASP.NET y Azure. Las empresas que usan .NET casi siempre tienen SQL Server en producción. El stack queda coherente: Python → PostgreSQL, C# → SQL Server.

**Herramienta visual:** SQL Server Management Studio (SSMS) · Azure Data Studio

**Conectores para C#:**
- `Entity Framework Core` con proveedor `Microsoft.EntityFrameworkCore.SqlServer`
- `Dapper` — funciona nativamente con SQL Server

**Temas:**
- CRUD y JOINs (mismo concepto que PostgreSQL)
- T-SQL: el dialecto SQL de Microsoft — diferencias clave vs SQL estándar
- Procedimientos almacenados y funciones en T-SQL
- Triggers en SQL Server: `AFTER`, `INSTEAD OF`
- Índices: clustered vs non-clustered
- Vistas e índices de vistas
- Diferencias clave vs PostgreSQL
- Optimización de consultas y planes de ejecución
- SQL Server en Azure: SQL Database y SQL Managed Instance *(nivel avanzado)*

---

### MongoDB — No Relacional
> La NoSQL más demandada. Datos flexibles y escalabilidad horizontal.

**Por qué MongoDB:** PostgreSQL maneja datos con estructura fija y relaciones claras. MongoDB maneja datos flexibles, que cambian de forma, o que necesitan escalar horizontalmente. El mercado real usa ambos. Un backend que solo conoce uno tiene un hueco visible en cualquier entrevista.

**Herramienta visual:** MongoDB Compass · MongoDB Atlas (nube gratuita)

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

### Análisis de Datos — Complemento de este pilar

**Temas:**
- SQL avanzado para análisis: agregaciones complejas, vistas analíticas
- Pandas y NumPy: limpiar y transformar Excel/CSV desde Python
- ETL básico: extraer de Excel → transformar con Python → cargar a PostgreSQL
- Matplotlib básico — visualización desde Python
- Power BI: visualización sin código, muy pedido en empresas locales y regionales

**Herramientas:** `Pandas` · `NumPy` · `Matplotlib` · `Power BI Desktop` · `Jupyter Notebooks`

---

## PILAR 2 — Programación Backend

### Lenguaje 1 — Python `Prioridad 1`
> Cubre backend, datos e IA con un solo lenguaje. Es donde construyes todos tus proyectos iniciales.

**Lo específico de Python** *(lo general ya está en el Pilar 0):*
- Sintaxis y tipado dinámico
- Decoradores, generadores, context managers
- Librerías estándar: `os`, `sys`, `datetime`
- Type Hints: tipado opcional que FastAPI usa para validar datos
- Programación asincrónica con `asyncio`

**Frameworks:**
- `FastAPI` — Tu framework principal. APIs REST modernas, tipadas, con Swagger automático
- `Django` — Lo estudias después. Framework completo con panel de administración y ORM propio

**Librerías clave:**
- `SQLAlchemy` — ORM para PostgreSQL
- `Alembic` — Migraciones de base de datos
- `PyMongo` / `Motor` — Conectores para MongoDB
- `Pydantic` — Validación de datos, integrado con FastAPI
- `bcrypt` / `Passlib` — Hashing de contraseñas
- `python-jose` — JWT
- `slowapi` — Rate limiting

---

### Lenguaje 2 — JavaScript / TypeScript `Prioridad 2`
> Cubre backend con Node.js y frontend con React. Domina el mercado remoto internacional.

**Lo específico de JS/TS** *(lo general ya está en el Pilar 0):*
- JavaScript moderno: ES6+, destructuring, spread operator, template literals
- Array methods: map, filter, reduce
- TypeScript: tipos estáticos, interfaces, generics, decoradores
- Node.js: módulos, NPM, event loop, servidores HTTP
- Manipulación del DOM (para el frontend mínimo)

**Frameworks backend:**
- `NestJS` — Framework estructurado para APIs en TypeScript. Lo que usan empresas serias
- `Express.js` — Base de NestJS. Lo conoces por contexto

**ORMs y conectores:**
- `Prisma` — ORM moderno para PostgreSQL y SQL Server
- `Mongoose` — ODM para MongoDB

**Frontend mínimo** *(solo lo necesario para que tus proyectos tengan pantalla):*
- `React` — Componentes funcionales, `useState`, `useEffect`, llamadas a tu API
- `Next.js` — Encima de React cuando necesites SEO en proyectos públicos
- `Tailwind CSS` — Diseño sin escribir CSS desde cero

---

### Lenguaje 3 — C# / .NET `Prioridad 3`
> Muy solicitado en empresas enterprise. Integración natural con Azure para trabajo remoto.

> Cuándo estudiarlo: cuando los 3 proyectos de portafolio estén terminados.

**Lo específico de C#** *(lo general ya está en el Pilar 0):*
- Tipado estático y estricto
- LINQ: consultas integradas en el lenguaje
- Namespaces y estructura de proyectos .NET
- Programación asincrónica con Task/async

**Frameworks:**
- `ASP.NET Core` — Framework principal para APIs REST en C#
- `Minimal APIs` — Forma moderna y ligera, similar a FastAPI

**ORMs y conectores:**
- `Entity Framework Core` — ORM oficial de .NET. SQL Server es su BD natural; también conecta con PostgreSQL
- `Dapper` — ORM ligero para control total del T-SQL y SQL estándar
- `MongoDB .NET Driver` — Conector oficial para MongoDB

**Testing y nube:**
- `xUnit` — Pruebas unitarias
- `Azure` — La nube natural de este lenguaje. SQL Server, despliegue y CI/CD viven ahí como servicios integrados

---

## PILAR 3 — APIs y Seguridad
> La seguridad no es un módulo aparte. Es parte del diseño desde el primer endpoint.

### Diseño de APIs REST

**Temas:**
- HTTP: métodos `GET`, `POST`, `PUT`, `DELETE`, `PATCH`
- Códigos de respuesta: 200, 201, 400, 401, 403, 404, 500
- Diseño coherente y semántico de endpoints
- Versionado desde el inicio: `/api/v1/recurso`
- Paginación y filtros
- Errores genéricos al usuario, detalles técnicos solo en logs internos
- Documentación con Swagger / OpenAPI

**Herramientas:**
- `Postman` / `Insomnia` — Probar y documentar endpoints
- `Swagger UI` — FastAPI lo genera automáticamente

---

### Seguridad Backend
> Conceptos transversales — aplican a los tres lenguajes.

**Temas:**
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
- Variables de entorno para secretos: nunca en el código

**Librerías por lenguaje:**

| Concepto | Python | JS/TS | C# |
|----------|--------|-------|----|
| Hashing | `bcrypt` / `Passlib` | `bcrypt` | `ASP.NET Core Identity` |
| JWT | `python-jose` | `jsonwebtoken` | `JwtBearer` |
| Rate Limiting | `slowapi` | `express-rate-limit` | Middleware custom |
| Headers seguridad | — | `helmet` | Middleware integrado |

---

### Arquitectura de Software
> Se absorbe con la práctica. No hay que memorizarlo — hay que aplicarlo.

**Temas:**
- Principios SOLID
- Clean Code
- Clean Architecture básica
- Patrones de diseño: Repository, Factory, Singleton
- System Design: cómo fluye la información entre servicios
- Monolito primero. Microservicios cuando el problema lo justifique
- DDD — Domain Driven Design *(nivel avanzado)*
- Event Sourcing y CQRS *(nivel avanzado)*

---

## PILAR 4 — Herramientas TI
> Sin esto no trabajas en equipo ni en remoto.

| Herramienta | Para qué | Cuándo |
|-------------|----------|--------|
| Git + GitHub | Control de versiones y portafolio | Desde el primer día |
| Postman / Insomnia | Probar APIs | Primera API |
| DBeaver | Administrar PostgreSQL y MongoDB | Al instalar la base de datos |
| Docker | Empaquetar la aplicación | Al terminar el primer proyecto |
| Terminal / Linux básico | Servidores remotos | Paralelo desde el inicio |
| Redis | Caché en memoria | Proyecto 2 o 3 |
| Inglés técnico | Documentación y trabajo remoto | 15 minutos diarios, siempre |

### Git — Temas clave
- `init`, `add`, `commit`, `push`, `pull`
- Ramas: `branch`, `merge`, `rebase`
- Resolución de conflictos
- Pull requests y revisión de código
- Git flow básico para trabajo en equipo
- README profesional en inglés para portafolio
- Conventional Commits

### Docker — Temas clave
- Contenedores vs máquinas virtuales
- `Dockerfile` básico
- `docker-compose` para API + base de datos
- Variables de entorno en contenedores
- Imágenes y registros

### Linux + Terminal
- Comandos básicos: `ls`, `cd`, `mkdir`, `mv`, `cp`, `rm`
- Permisos: `chmod`, `chown`
- Procesos: `ps`, `kill`, `top`
- SSH para conectarse a servidores remotos
- Cron jobs básicos

### Redis
- Tipos de datos: strings, hashes, listas, sets
- TTL — expiración de datos en caché
- Cachear respuestas de API
- Gestión de sesiones

---

## PILAR 5 — Testing

**Temas:**
- Tipos de tests: unitario, integración, end-to-end (E2E)
- Pirámide de testing
- Mocking y fixtures
- Tests para endpoints de API
- Cobertura de código
- TDD — Test Driven Development

**Herramientas por lenguaje:**

| Lenguaje | Testing unitario | Testing API |
|----------|-----------------|-------------|
| Python | `pytest` | `httpx` / `TestClient` de FastAPI |
| JS/TS | `Jest` | `Supertest` |
| C# | `xUnit` | `WebApplicationFactory` |

---

## PILAR 6 — Frontend Básico
> Solo lo necesario para que tus proyectos tengan pantalla.

### HTML y CSS
- Etiquetas semánticas: `div`, `section`, `form`, `button`, `input`
- Flexbox y Grid para layout
- Box model: margin, padding, border
- Media queries básicas (diseño responsive)
- Variables CSS

### React — Lo indispensable
- Componentes funcionales
- `useState` — estado local
- `useEffect` — efectos y ciclo de vida
- Llamadas a tu propia API con `fetch` / `Axios`
- Props y comunicación entre componentes
- Formularios controlados
- React Router — navegación

### Conexión Frontend → Backend
- Axios para peticiones HTTP
- Enviar y recibir JWT
- Manejo de estados de carga y error
- Variables de entorno en frontend

**Herramientas:** `React 18` · `Tailwind CSS` · `Axios` · `Vite` · `React Router` · `Next.js`

---

## Proyectos de Portafolio
> No son ejercicios. Son productos. Cada uno va a GitHub con README en inglés.

### Proyecto 1 — Sistema de clientes con autenticación
- **Stack:** Python + FastAPI + PostgreSQL + React
- **Demuestra:** API REST, base de datos relacional, JWT, frontend funcional

### Proyecto 2 — API de análisis de gastos
- **Stack:** Python + FastAPI + Pandas + PostgreSQL + Power BI
- **Demuestra:** Backend + ETL + análisis de datos integrado

### Proyecto 3 — ERP light con roles y auditoría
- **Stack:** Python + FastAPI + PostgreSQL + MongoDB + React + Docker
- **Stack C# (variante):** ASP.NET Core + SQL Server + MongoDB + React + Docker
- **Demuestra:** Arquitectura real, roles, lógica de negocio, SQL y NoSQL juntos, contenedores

---

## Evolución Profesional — El siguiente nivel

### Nivel 2 — Backend Senior
- Microservicios, DDD, Event Sourcing, CQRS
- Message Brokers: RabbitMQ o Kafka
- WebSockets para tiempo real
- Observabilidad: monitoreo y métricas con Grafana, Prometheus

### Nivel 3 — Cloud / DevOps
- AWS o Azure con certificación
- Kubernetes, Terraform
- CI/CD avanzado con GitHub Actions
- Serverless: Lambda, Azure Functions
- Seguridad en nube: IAM, VPC, secrets

### Ruta A — AI Engineer ⭐ *El perfil más buscado hoy*
- Python + LLMs + LangChain integrado en APIs propias
- LlamaIndex, RAG — Retrieval Augmented Generation
- Embeddings y bases de datos vectoriales
- OpenAI API, Anthropic API, HuggingFace

### Ruta B — Cloud Architect 💰 *Uno de los perfiles mejor pagados*
- Infraestructura completa para sistemas grandes
- Multi-cloud y disaster recovery
- Certificaciones AWS Solutions Architect
- FinOps — optimización de costos en nube
- Zero Trust Security

---

## Nota sobre trabajo remoto

Con **Python + FastAPI + PostgreSQL + React + Docker** ya puedes aplicar a trabajos remotos junior. Para el mercado anglosajón (Upwork, Remote.com, Toptal):

1. Sube el portafolio a GitHub con README en inglés
2. Documenta el código en inglés desde el inicio
3. Construye perfil en LinkedIn en inglés
4. Lee documentación oficial en inglés 15 min/día desde hoy

> La diferencia entre un dev local y uno remoto suele ser el inglés técnico y la documentación del código — ambos se construyen desde el día 1.
