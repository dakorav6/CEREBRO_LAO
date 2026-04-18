## Angular Matirial(lat)

No son plantillas como tal mas bien son como latrillos que podemos reusar para crear un diseño.


Angular Material - LINK: https://material.angular.dev/components/categories
1. debemos de seguir los requisitos de la guia de la pagina oficial de Angular matirial  como instalar el angular material: `ng add @angular/material` 

## Angular Iconos 

https://www.angularjswiki.com/angular/angular-material-icons-list-mat-icon-list/


## Creacion de componenetes y estructura de archivos 

Cada pieza de tu interfaz (el menú, el pie de página, el login) debe ser un componente independiente guardado en su propia carpeta. Esto mantiene tu proyecto organizado.

### Cómo crear un componente correctamente

comando largo:`ng generate component components/navbar`
comando corto: `ng g c components/navbar`

**¿Qué hace este comando?**

- Crea la carpeta navbar.
- Crea los 4 archivos necesarios: .ts (lógica), .html (vista), .css (estilos) y .spec.ts (pruebas).
- Configura el componente como Standalone automáticamente (perfecto para tu versión de Angular).


### Cómo "conectar" los componentes

al momento de crear los componentes: `ng g c components/navbar` y generar los archivos para ese componenete dentro del TS del componenete creado tenemos:

```typescript
import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar', // NOMBRE DE LA ETIQUETA A USAR
  imports: [],
  templateUrl: './navbar.html',
  styleUrl: './navbar.css',
})
export class Navbar {} // NOMBRE DE LA CLASE A EXPORTAR PARA CONECTAR.

```


Paso 1: Importarlo en el componente padre

```typescript
// app.ts
import { NavbarComponent } from './components/navbar/navbar.component'; // 
import { Navbar } from './components/navbar/navbar'; //NOMBRE DE LA CLASE A IMPORTAR PARA CONECTAR

<-- Importas la clase 

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MatButtonModule, Navbar], // <-- Lo añades a la lista de permisos
  templateUrl: './app.html',
})
export class App { ... }
```

Y en el HTML

```html
<app-navbar></app-navbar>

```
----



