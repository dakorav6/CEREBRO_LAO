

- Es lo que permite que tu aplicación cambie de "página" sin tener que recargar todo el navegador.
- Es el sistema que decide qué componente mostrar según la URL.




## Routing -  configuracion arreglo de las componentes 

**Sintaxis: app.routes.ts**

Se define un arreglo de objetos donde cada uno asocie un camino (path) con un componente.
```typescript
import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' }, // RUTA POR DEFECTO
 { path: 'login', component: LoginComponent },
 { path: '**', component: NotFoundComponent } //RUTA NO ENCONTRADA
];
```
>basicamente si escribes login en el URL mostrara la componente, donde? dentro de la etiqueta `<router-outlet></router-outlet>` en el HTML app.component.html
----

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
----

**app.html**
```html
<!-- app.component.html -->
<main>
  <router-outlet></router-outlet> <!-- Aquí aparecerá Login o Principal -->
</main>
```


## 2 formas de accionar el boton para redirigir

Se usa cuando la navegación depende de lógica

### 1. La forma declarativa: routerLink
- Es la más eficiente y la que deberías usar por defecto.
- El routerLink en el HTML es para clics directos: el usuario hace clic y se va. Fin.

> En el Componente donde esta en boton de accion es el que debe de importar el: import { RouterLink } from '@angular/router'; (ejem:componente LOGIN)

**html del componente con boton**
```html
<button routerLink="/componentePrincipal">Ir al Principal</button>
```
### 2. La forma imperativa: Router.navigate()


- Se usa cuando, por ejemplo, el usuario hace clic en "Login", tú validas sus credenciales en el servicio y, solo si son correctas, lo rediriges. Aquí necesitas el servicio Router.
- Úsalo cuando la redirección depende de una respuesta del servidor, un cálculo o una validación.

-la recomendación oficial es dejar de usar el constructor para inyectar servicios y empezar a usar la función inject(). => por que si hay un metodo para hacerlo con constructor "forma antigua"

**nombComponente.ts**
```typescript
import { Component, inject } from '@angular/core'; // Añadimos inject aquí
import { Router } from '@angular/router';

@Component({ ... })

export class LoginComponent {
  // Directo, legible y moderno
  private router = inject(Router); 

  entrar() {
    this.router.navigate(['/principal']);
  }

}
```


##  Navegar con botones

```html
<a routerLink="/login">Ir a login</a>
<a routerLink="/home">Ir a home</a>
```
>En lugar de poner la URL, ponemos el componente que ya esta "ingresado" en app.routes.ts
