# Directivas y Flujo de Control (PENDIENTE ANALIZAR)

Las directivas son instrucciones que le das al HTML para que cambie su apariencia o estructura. Con las nuevas versiones de Angular, el flujo de control es muy intuitivo:

    @if: Muestra u oculta elementos según una condición.

    @for: Repite un elemento para mostrar una lista de datos.

    @switch: Selecciona entre varias opciones posibles



## @if (PENDIENTE)

- PARA QUÉ SIRVE: Mostrar u ocultar elementos del DOM según una condición.
- Si es true, renderiza el bloque. Si es false, lo elimina del DOM — no lo oculta, lo elimina.

>*ngIf ya no se usa como directiva de atributo en Angular moderno.Fue reemplazado por @if



### Como se usa?


```html

@if (usuario.logueado) {
  <p>Bienvenido, {{ usuario.nombre }}</p>
} @else {
  <p>Inicia sesión</p>
}

```
En el componente:

```typescript
usuario = { logueado: true, nombre: 'Jordan' };

```


## *ngIf

>En Angular 17+, *ngIf fue reemplazado por la sintaxis @if / @else en las plantillas. Es más legible y no requiere importar NgIf 

- añade o elimina un elemento del DOM según una condición.
- Muestra contenido solo cuando tiene sentido mostrarlo: un panel de admin solo para admins, un spinner mientras carga data, un mensaje de error si algo falla.
- Evalúa la expresión que le pasas. Si es truthy, inserta el elemento en el DOM. Si es falsy, lo elimina completament


### Proceso

**app.component.ts**
```typescript

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {
  isLoggedIn = false;

  toggleLogin() {
    this.isLoggedIn = !this.isLoggedIn;
  }
}
```
