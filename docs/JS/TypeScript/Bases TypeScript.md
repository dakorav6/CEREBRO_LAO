

# ¿Qué es TypeScript?

Es un javaScript pero con tipado en los datos.

- **Tipado:** Le dices a la computadora qué tipo de dato es cada cosa (número, texto, etc.).
- **Compilación:** El navegador no entiende TypeScript, así que usamos una herramienta para convertirlo a JavaScript normal.

### En donde se usa TypeScript

- **Frontend (Web): Se usa con React, Angular o Vue**  para crear interfaces donde los datos fluyan sin errores entre componentes.
- **Backend (Servidores): Con **Node.js o NestJS** para asegurar que la base de datos y el servidor hablen el mismo "idioma".


## Instalacion y mesa de trabajo

1. **Node.js**: El entorno de ejecución. (se instala una sola vez y ya viene en el codeScpace instalado)
    1. Instalador, PowerShell: `winget install OpenJS.NodeJS.LTS` 
    2. verificar instalacion con version : `node -v`

2. Puedes trabajar TS de manera LOCAL o GLOBAL, vamos a trabajar de maneral LOCAL instalando TS por proyecto.
  - `mkdir mi-proyecto-ts` (Crea la carpeta del proyecto)
  - `npm init -y`(dentro de la carpeta creada), Crea el archivo `package.json`. Es el "DNI" de tu proyecto donde se anotan las librerías que vas a usar. 
  - `npm install typescript --save-dev` (Es el compilador de TS)


3.`npx tsc --init` (Configurar TypeScript) , crea el archivo *tsconfig.json*. Aquí es donde debes buscar y modificar las líneas que mencionas:
  - `"rootDir": "./src"`: Dónde está tu código TS (src)

  - `"outDir": "./dist"`: Aquí le dices: "Cuando termines de traducir mi código a JavaScript, guárdalo en la carpeta `dist`".

  -`"experimentalDecorators": true,`  , Habilitar el uso de decoradores    que es decorador?


4. `mkdir src` crear carpeta del los TS**(aqui escribimos nuestro codigo TS)
    

 ### Ejecucion del codigo. 

1.  **`npx tsc`**: Compila todo el proyecto y transforma de  TS a JS. PERO luego tienes que ejecutar el node para ejecutar el archivo....

2. **`node dist/nombrearchivo.js`**: Así es como pones a funcionar tu código en el servidor Node.js después de haberlo compilado.

**nota:** Si no quieres estar escribiendo npx tsc y luego node archivo.js cada vez, puedes usar este comando combinado:

```
npx ts-node nombre_de_tu_archivo.ts

```



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
### ANY

any significa:
👉 “puede ser cualquier tipo de dato”
en otras palabras no hay validacion de tipos aqui (typeScript deja de ser)

**Resumen claro**
- any = cualquier tipo (sin control)
- TypeScript deja de protegerte ⚠️
- Úsalo lo menos posible
- Mejor usar unknown cuando puedas 


```typescript
let dato: any = 10;

dato = "hola";
dato = true;
dato = [1, 2, 3];
//Puede cambiar de tipo sin problema

```
### Unknown

o valor  Desconocido , basicamente es el metodo seguro porque? simplemente tienes la limitacion de no poder usarse  como el tipo que es, desde una simple suma de 2 numeros enteros o   covertir una cadena de caracteres en mayuscula. 

a menos que usemos el dichoso: 

```typescript
let usuario: unknown = { nombre: "Alex" };

// Primero revisamos que sea un objeto y no sea null
if (typeof usuario === "object" && usuario !== null && "nombre" in usuario) {
    // TypeScript deduce que 'usuario' tiene la propiedad 'nombre'
    console.log("El nombre es válido");
}
```
nota: si con any tambien podemos usar el typeof pero ese no es el problema, el problema es qe any no tiene limitaciones al momeno de usarse pero unknown si tiene limitantes por que primer tiene que pasar por la validacion de tipo (gracias al typeof), y tu diras pero dentro de ese bloque condicional aun sigue siendo **unknown** y eso es verdad pero typescrip **sobre entiendo que** dentro de ese bloque de la condicional solo existe un valor del tipo que corresponde. 




## Estructura de datos:

### ARRAY

```typescript
let numeros: number[] = [1, 2, 3, 4];

let frutas: string[] = ["manzana", "pera", "uva"];
```
***Agregar elementos**=>  ```numeros.push(3); // [1, 2, 3]```


### ENUN
 solo puede tener valores que se le impongan. 
  - `enun estado{Aprobado , Rechasado , Pendiente}`
  
```typescript
enun diasLaborables{lunes,martes,miercoles}
let diaActual:diasLaborable=diasLaborables.lunes;
```

### Tuplas

Una tupla es un array con:
- número fijo de elementos
- tipos definidos en posiciones específicas

```typescript
let persona: [string, number];

persona = ["Juan", 25]; // ✅ correcto
persona = [25, "Juan"]; // ❌ error

//Otro Ejemplo:
let persona: [string, number] = ["Ana", 30];

console.log(persona[0]); // "Ana"
console.log(persona[1]); // 30
```
**Truplas con una valor opcional**
```typescript
let producto: [string , string , number , number?];

producto= ["001","Lapiz negro",0.25 ]

```

***Tuplas con nombres (más legible 👍)***
Esto ayuda a entender mejor el codigo.
```typescript
let usuario: [nombre: string, edad: number];

usuario = ["Luis", 22];
```
**Diferencia con array normal**
- puede cambiar el orden ❌
- puede tener más elementos


----

## Funciones con tipos

TypeScript te ayuda a que tus funciones siempre reciban y devuelvan lo que esperas. Así evitas el error de intentar sumar un número con un texto por accidente.

```typescript
function sumar(a: number, b: number): number {
  return a + b;
}

// Si intentas hacer sumar(5, "10"), TypeScript te avisará del error antes de que corras el código.

```


### Funcion sin retorno (void)

En TypeScript, cuando una función no retorna ningún valor, se usa el tipo void.

```typescript
function mostrarMensaje(mensaje: string): void {
  console.log(mensaje);
}
```

### Arrow function (función flecha)

usos:
- Funciones cortas
- Callbacks (muy común)
- No necesitas this


```typescript
const restar = (a: number, b: number): number => {
  return a - b;
};
```
Forma Corta
```typescript
const multiplicar = (a: number, b: number): number => a * b;
```



### Funcion con  Parámetros opcionales

```typescript
function saludar(nombre?: string): string {
  return `Hola, ${nombre ?? "invitado"}`;
}
```





## Interfaces (La estructura de tus objetos)

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

------
## Bases para el Bakend





----
## Otras cosas 

### typeof
retorna un String que define el tipo de datos: "number" , "string" , "boolean" , "object" , "undefined"

