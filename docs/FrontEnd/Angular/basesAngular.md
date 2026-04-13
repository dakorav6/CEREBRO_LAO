# Angular

- Todo en Angular es un componente. Imagina que tu aplicación es un juego de LEGO: cada pieza (el buscador, el menú, la lista de productos) es un componente independiente que contiene su propia lógica, diseño y estructura.
- Cada componente se divide en tres archivos principales: HTML , CSS Y TYPESCRIPT

## Instalacion y mesa de trabajo

1. Node.js: El entorno de ejecución.
2. Angular CLI: La herramienta de comandos. Se instala con npm install -g @angular/cli.
3. VS Code: El editor de texto preferido por la comunidad.

Tip de Pro: Una vez instalado el CLI, solo necesitas escribir ng serve en tu terminal para ver tu aplicación funcionando en vivo en el navegador.


## Data Binding (Vinculación de Datos) (PENDIENTE ANALIZAR)
Es la forma en que el código (.ts) y la vista (.html) se comunican. Los tipos más comunes son:

- Interpolación	{{ valor }}	(TS -> HTML)	            Mostrar una variable en el texto.
- Property Binding	[propiedad]="valor"	(TS -> HTML)	Cambiar atributos (ej. deshabilitar un botón).
- Event Binding	(click)="metodo()"	(HTML -> TS)        Detectar acciones del usuario.
- Two-way Binding	[(ngModel)]="var"	(Ambos)	        Sincronizar un input con una variable en tiempo real.


## Directivas y Flujo de Control (PENDIENTE ANALIZAR)

Las directivas son instrucciones que le das al HTML para que cambie su apariencia o estructura. Con las nuevas versiones de Angular, el flujo de control es muy intuitivo:

    @if: Muestra u oculta elementos según una condición.

    @for: Repite un elemento para mostrar una lista de datos.

    @switch: Selecciona entre varias opciones posibles