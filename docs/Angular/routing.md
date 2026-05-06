

- Es lo que permite que tu aplicación cambie de "página" sin tener que recargar todo el navegador.
- Es el sistema que decide qué componente mostrar según la URL.

-Se define un arreglo de objetos donde cada uno asocie un camino (path) con un componente.

## Hay 2 formas de hacerlo...

### 1. Primera Forma: Desde HTML con routerLink

**Sintaxis: app.routes.ts**

```typescript
import { Routes } from '@angular/router';
import { RouterOutlet } from '@angular/router';
import { LoginComponent } from './login/login.component';

import { HomeComponent } from './home/home.component';

export const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' }, // RUTA POR DEFECTO
 { path: 'login', component: LoginComponent },
 { path: 'home', component: HomeComponent },
 { path: '**', component: NotFoundComponent } //RUTA NO ENCONTRADA
];
```
>basicamente si escribes login en el URL mostrara la componente, donde? dentro de la etiqueta `<router-outlet></router-outlet>` en el HTML app.component.html

**app.ts**

>debemos importar el { RouterOutlet } es el que sabe como inyectar componentes en el DOOM.
```typescript
import { RouterOutlet } from '@angular/router'; // IMPORTANTE

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet], // Aquí le das permiso al HTML de usar <router-outlet>
  templateUrl: './app.component.html'
})
export class AppComponent { }

```
**app.html**
```html
<!-- app.component.html -->
<main>
  <router-outlet></router-outlet> <!-- Aquí aparecerá Login o Principal -->
</main>
```


###  Segunda forma:  Desde TypeScript con router.navigate()

Se usa cuando la navegación depende de lógica



##  Navegar con botones

```html
<a routerLink="/login">Ir a login</a>
<a routerLink="/home">Ir a home</a>
```
>En lugar de poner la URL, ponemos el componente que ya esta "ingresado" en app.routes.ts
