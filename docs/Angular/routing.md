

- Es lo que permite que tu aplicación cambie de "página" sin tener que recargar todo el navegador.
- Es el sistema que decide qué componente mostrar según la URL.




## Routing -  configuracion arreglo de las componentes 


- Se define un arreglo de objetos donde cada uno asocie un camino (path) con un componente.

**app.routes.ts**
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

- debemos importar el { RouterOutlet } es el que sabe como inyectar componentes en el DOOM.
- No debemos poner o importar los componentes que ya estan declarados en el app.routes.ts

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
  <menuPrincipal></menuPrincipal>
  <router-outlet></router-outlet> <!-- Aquí aparecerá Login o Principal -->
  <piePagina></piePagina> 
</main>
```


## 2 formas de accionar el boton para redirigir

Se usa cuando la navegación depende de lógica

### 1. La forma declarativa: routerLink con el `<router-outlet>`
- Es la más eficiente y la que deberías usar por defecto.
- El routerLink en el HTML es para clics directos: el usuario hace clic y se va. Fin.

> En el Componente donde esta en boton de accion es el que debe de importar el: import { RouterLink } from '@angular/router'; (ejem:componente LOGIN)

**html del componente con boton**
```html
<button routerLink="/componentePrincipal">Ir al Principal</button>
```

```html
<a routerLink="/login">Ir a login</a>
<a routerLink="/home">Ir a home</a>

```

### 2. La forma imperativa: Router.navigate()

- Se usa cuando la navegación depende de una lógica previa, como validar si el usuario existe. Si el backend responde con éxito, se ejecuta el cambio de ruta.
-Esta ocurre en el archivo .ts. Se usa cuando necesitas que pase algo antes de cambiar de pantalla.
- Úsalo cuando la redirección depende de una respuesta del servidor, un cálculo o una validación.

-la recomendación oficial es dejar de usar el constructor para inyectar servicios y empezar a usar la función inject(). => por que si hay un metodo para hacerlo con constructor "forma antigua"




**Existe 2 formas: constructor (antiguo) y el inject()**



**PRIMERA FORMA - CONSTRUCTOR**

1. Cremos un constructor con un objeto de la clase Routing (no estamos creando un objeto Routing, estamos invocando uno que ya esta funcionando y trabajando) que para eso tenemos que importarlo tambien.

>no debemos importar la componente de destino 

```TYPESCRIPT

import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html'
})
export class LoginComponent {

  constructor(private router: Router) {}

  login(): void {
    
  // 1. LÓGICA PRIMERO
  if (this.usuario === 'admin' && this.password === '1234') {
    
    // 2. NAVEGACIÓN DESPUÉS
    this.router.navigate(['/dashboard']);
    
  } else {
    console.log('credenciales inválidas');
  }
  }
}

```
- RouterLa clase — el molde
- router (minúscula)La instancia — el objeto 
- private Que esa instancia queda accesible como this.router en toda la clase
- creamos un metodo del tipo void (que no retorna nada) 

>para que?, para usar this.router.bavigate() y la parte LOGICA





**SEGUNDA FORMA**



- devemos importar `{Component , inject}`
- basicamente guardamos el objeto directamente en una variable. 

**nombComponente.ts**
```typescript
import { Component, inject } from '@angular/core'; // Añadimos inject aquí
import { Router } from '@angular/router';

@Component({ ... })

export class LoginComponent {
  // Directo, legible y moderno
  private router = inject(Router); 

  entrar(): void {
    this.router.navigate(['/principal']);
  }

}

```


## Reflexiones:
- por que no usamos new Router() para crear un objeto? por que este objeto que creemos no tendria contexto e informacion sobre la navegacion, solo tenemos que importar y usar un objeto routing que ya esta trabajando. 

- como es que podemos meter un objeto Routing solo importando la clase Routing?
no es una variable global como podriamos creer(Una variable global es un desastre sin dueño.) ,  La palabra correcta es Singleton provisto por el injector, Angular registra el Router en el injector raíz — un contenedor central que vive mientras vive la aplicación.
- contenedor central de angular? que juguetes puedo sacar de ahi?
Los más comunes que vas a usar:
```typescript
// Navegación
private router = inject(Router);

// Leer parámetros de la URL actual
private route = inject(ActivatedRoute);

// HTTP — consumir APIs
private http = inject(HttpClient);

// Comunicación entre componentes
private miServicio = inject(MiServicio);
```
>Pero hay algo importante que entender: No solo los servicios de Angular viven ahí. Tus propios servicios también. Cuando creas un servicio con:
>Ese providedIn: 'root' es exactamente eso — "registra este servicio en el injector raíz". Desde ese momento cualquier componente puede pedirlo.

```typescript
@Injectable({
  providedIn: 'root'
})
export class MiServicio {}
```