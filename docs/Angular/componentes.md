## Angular Matirial(lat)

No son plantillas como tal mas bien son como latrillos que podemos reusar para crear un diseño.


Angular Material - LINK: https://material.angular.dev/components/categories
1. debemos de seguir los requisitos de la guia de la pagina oficial de Angular matirial  como instalar el angular material: `ng add @angular/material` 


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

**Componente/navbar "footer.ts"**
```typescript
import { Component } from '@angular/core';
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-footer',
  imports: [MatToolbarModule, MatButtonModule, MatIconModule],//los componentes usados del angular matrial importados.
  templateUrl: './footer.html',
  styleUrl: './footer.css',
})
export class Footer {}

```


Paso 1: Importarlo en el componente padre

**app.ts**
```typescript
//Importamos los componentes creados por nosotros.
import { Component, signal } from '@angular/core';
import { Login } from './components/login/login';
import { Footer } from './components/footer/footer';

@Component({
  selector: 'app-root',
  imports: [Login, Footer], //Agreamos los componenetes importados.
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('primerAngular');
}

```

Y en el HTML

**app-html**
```html
<app-footer></app-footer>

```
----



