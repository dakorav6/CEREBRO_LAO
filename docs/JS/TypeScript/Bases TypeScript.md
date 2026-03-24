<link rel="stylesheet" href="../../markdown_and_style/Style_cerebroLao.css">


- Instalación debemos Ejecuta el comando: `npm install -g typescript`
- creación de archivo:  cualNom.ts
- para ejecutarlo- terminal: debemos convertirlo a JS con => `tsc cualNom.ts`



# ¿Qué es TypeScript?

Imagina que JavaScript es un papel en blanco donde puedes escribir lo que sea. **TypeScript** es ese mismo papel pero con líneas y márgenes (reglas).
- **Tipado:** Le dices a la computadora qué tipo de dato es cada cosa (número, texto, etc.).
- **Compilación:** El navegador no entiende TypeScript, así que usamos una herramienta para convertirlo a JavaScript normal.

## En donde se usa TypeScript

- **Frontend (Web): Se usa con React, Angular o Vue**  para crear interfaces donde los datos fluyan sin errores entre componentes.
- **Backend (Servidores): Con **Node.js o NestJS** para asegurar que la base de datos y el servidor hablen el mismo "idioma".


## Iniciar proyecto

**Paso 1: Inicializar el proyecto**
- **Comando:** `npm init -y`
     **¿Para qué sirve?:** Crea el archivo `package.json`. Es el "DNI" de tu proyecto donde se anotan las librerías que vas a usar. El `-y` es para aceptar todo por defecto y no perder tiempo.
**Paso 2: Instalar TypeScript (Local)**
- **Comando:** `npm install typescript --save-dev`
	- **¿Para qué sirve?:** Descarga el compilador de TypeScript específicamente para este proyecto. Usamos `--save-dev` porque TypeScript solo se necesita para **desarrollar**; cuando el código ya está en internet funcionando (producción), solo se usa el JavaScript resultante.
	
**Paso 3: Configurar TypeScript**
- **Comando:** `npx tsc --init`
	- **¿Para qué sirve?:** Genera el archivo `tsconfig.json`. Aquí es donde debes buscar y modificar las líneas que mencionas:
    - `"rootDir": "./src"`: Aquí le dices a la IA y al compilador: "Busca mis archivos `.ts` en la carpeta `src`".
    - `"outDir": "./dist"`: Aquí le dices: "Cuando termines de traducir mi código a JavaScript, guárdalo en la carpeta `dist`".
        

**Paso 4: Organización y Compilación**

- **`mkdir src`**: Crea la carpeta donde vivirán tus archivos.
    
- **`npx tsc`**: Este es el comando más importante. Lee todo tu proyecto y "traduce" masivamente de TS a JS.
    
- **`node dist/nombrearchivo.js`**: Así es como pones a funcionar tu código en el servidor Node.js después de haberlo compilado.


-----

## Tipos de datos básicos

En TypeScript, siempre debes intentar decir qué tipo de información estás guardando:

- **string:** Para texto.
- **number:** Para números.
- **boolean:** Para `true` o `false`.
- **any:** Significa "cualquier cosa" (evita usarlo, ¡porque quita la gracia de usar TypeScript!).

```typescript
let nombre: string = "Alex"; 
let edad: number = 25; 
let esEstudiante: boolean = true;
```

### Interfaces (La estructura de tus objetos)

Esta es la base para trabajar de forma profesional. Una **Interface** es como un contrato o un molde para tus objetos.

```
interface Usuario {
  id: number;
  nombre: string;
  correo: string;
  premium?: boolean; // El signo '?' significa que es opcional
}

const persona: Usuario = {
  id: 1,
  nombre: "Maria",
  correo: "maria@ejemplo.com"
};
```

### Funciones con tipos

TypeScript te ayuda a que tus funciones siempre reciban y devuelvan lo que esperas. Así evitas el error de intentar sumar un número con un texto por accidente.

```
function sumar(a: number, b: number): number {
  return a + b;
}

// Si intentas hacer sumar(5, "10"), TypeScript te avisará del error antes de que corras el código.

```

------
## Bases para el Bakend

