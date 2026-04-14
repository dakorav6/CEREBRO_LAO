# Angular

- Todo en Angular es un componente. Imagina que tu aplicación es un juego de LEGO: cada pieza (el buscador, el menú, la lista de productos) es un componente independiente que contiene su propia lógica, diseño y estructura.
- Cada componente se divide en tres archivos principales: HTML , CSS Y TYPESCRIPT

## Instalacion y mesa de trabajo

1. Node.js: El entorno de ejecución. (se instala una sola vez y ya viene en el codeScpace instalado)
    1. Instalador, PowerShell: `winget install OpenJS.NodeJS.LTS` 
    2. verificar instalacion con version : `node -v`

2. Angular CLI: (se instala una sola vez en la maquina , no viene instalado en el codeSpace) 
    - Se instala con `npm install -g @angular/cli`

3. Iniciar nuevo proyecto Angular, dentro de la carpeta ejecutar el comando. `ng new nombre-de-tu-app`

    - ¿Estas de acuerdo? si
    - ¿Qué formato de estilos prefieres?: Puedes elegir CSS, SCSS, Sass, etc. (SCSS es muy común en entornos profesionales).
    -  Do you want to enable Server-Side Rendering (SSR) and Static Site Generation (SSG/Prerendering)? (y/N) NO por ahora. 
    - IA? 


4. Entra a la carpeta donde esta el proyecto con `cd ` y levantamos el servidor para
verlo en el navegador: `ng serve --open`


## Libreria de Componentes de ANGULAR  (Recursos)
LINK: https://material.angular.dev/components/categories
- Angular Material
- Bootstrap
- Tailwind CSS ? suena interesante



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