# Angular

- Todo en Angular es un componente. Imagina que tu aplicación es un juego de LEGO: cada pieza (el buscador, el menú, la lista de productos) es un componente independiente que contiene su propia lógica, diseño y estructura.
- Cada componente se divide en tres archivos principales: HTML , CSS Y TYPESCRIPT

## Instalacion y mesa de trabajo

1. Node.js: El entorno de ejecución. (se instala una sola vez y ya viene en el codeScpace instalado)
    1. Instalador, PowerShell: `winget install OpenJS.NodeJS.LTS` => instalacion del motor de JS y el comando **npm**
    2. verificar instalacion con version : `node -v`

2. Angular CLI: (se instala una sola vez en la maquina , no viene instalado en el codeSpace) 
    - Se instala con `npm install -g @angular/cli`

3. Iniciar nuevo proyecto Angular, dentro de la carpeta ejecutar el comando. `ng new nombre-de-tu-app`

*la carpeta que esta dentro del proyecto "node_modules" se crea autmaticamente gracias al comando anterior  `ng new nombre-de-tu-app` pero esta carpeta no se copia y no se traslada y cuando copiamos un nuevo proyecto o iniciamos en un nuevo entorno de trabajo debemos instalarla con:  `npm install` , que es el npm? es como una "App Store" o un "Play Store" para programadores. Es una herramienta que viene con Node.js y sirve para gestionar todas las librerías que tu proyecto necesita*


    - ¿Estas de acuerdo? si
    - ¿Qué formato de estilos prefieres?: Puedes elegir CSS, SCSS, Sass, etc. (SCSS es muy común en entornos profesionales).
    -  Do you want to enable Server-Side Rendering (SSR) and Static Site Generation (SSG/Prerendering)? (y/N) NO por ahora. 
    - IA? 


4. Entra a la carpeta donde esta el proyecto con `cd ` y levantamos el servidor para
verlo en el navegador: `ng serve --open`

nota: si no reconoce el comando ng es por que no tiene instalado el Angular CLI

nota: si no se habre la pagina es por que Angular Bloquea por que no reconoce a github como un entorno local para ella en lugar ejecuta: `npx ng serve --host 0.0.0.0 --disable-host-check`



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