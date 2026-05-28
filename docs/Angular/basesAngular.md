# Angular

- Angular es un framework (una forma ya establecida de como se tiene que llevar el trabajo) a diferencia de React que es un conjunto de librerias (una caja de herramientas) que te da libertad y por ende algo de desorden.

>Si entras a un proyecto de Angular en cualquier parte del mundo, los archivos se ven igual.

- Todo en Angular es un componente. Imagina que tu aplicación es un juego de LEGO: cada pieza (el buscador, el menú, la lista de productos) es un componente independiente que contiene su propia lógica, diseño y estructura.
- Cada componente se divide en tres archivos principales: HTML , CSS Y TYPESCRIPT

## Instalacion y mesa de trabajo

1. Node.js: El entorno de ejecución. (se instala una sola vez y ya viene en el codeScpace instalado)
    1. Instalador, PowerShell: `winget install OpenJS.NodeJS.LTS` => instalacion del motor de JS y el comando **npm**
    2. verificar instalacion con version : `node -v`

2. `npm install -g @angular/cli` , instalamos Angular CLI: (se instala una sola vez en la maquina , no viene instalado en el codeSpace), no crea ninguna carpeta.
- `ng v` => tenemos angular cli? nos devulve la version. 
>`npm install`: la carpeta que esta dentro del proyecto "node_modules" se crea autmaticamente gracias al comando  `ng new nombre-de-tu-app` pero esta carpeta no se copia y no se traslada y cuando copiamos un nuevo proyecto o iniciamos en un nuevo entorno de trabajo debemos instalarla con: `npm install` , que es el npm? es como una "App Store" o un "Play Store" para programadores. Es una herramienta que viene con Node y sirve para gestionar todas las librerías que tu proyecto necesita

3. `ng new nombre-de-tu-app` : Iniciar nuevo proyecto Angular, dentro de la carpeta ejecutar el comando. 


4. `ng serve --open` : Entra a la carpeta donde esta el proyecto con `cd ` y levantamos el servidor para
verlo en el navegador: 

>nota: si no reconoce el comando ng es por que no tiene instalado el Angular CLI


5. Trabajamos dentro de la carpeta SRC/App 

### Extenciones con que trabajar 

- Angular Language Service, Sirve para:
    - autocompletar directivas Angular
    - detectar errores en HTML Angular
    - Sin esto, Angular en VS Code se siente como programar con una venda en los ojos y resentimiento acumulado.





## Data Binding (Vinculación de Datos) (PENDIENTE ANALIZAR)
Es la forma en que el código (.ts) y la vista (.html) se comunican. Los tipos más comunes son:

- Interpolación	{{ valor }}	(TS -> HTML)	            Mostrar una variable en el texto.
- Property Binding	[propiedad]="valor"	(TS -> HTML)	Cambiar atributos (ej. deshabilitar un botón).
- Event Binding	(click)="metodo()"	(HTML -> TS)        Detectar acciones del usuario.
- Two-way Binding	[(ngModel)]="var"	(Ambos)	        Sincronizar un input con una variable en tiempo real.


