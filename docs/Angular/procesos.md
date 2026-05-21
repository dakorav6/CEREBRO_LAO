
## Login

### FormsModule - [(ngModel)]

- ngModel crea un enlace bidireccional entre el input del HTML y la propiedad del componente.
- Sin ngModel tendrías que escuchar el evento (input) manualmente y asignar el valor a mano. ngModel elimina ese trabajo.

**nombComponente.ts**
```typescript
import { Component, inject } from '@angular/core'; // Añadimos inject aquí
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms'; // Necesario para el manejo de formularios (ej. ngModel)

@Component({ ... })

export class Login {
// AQUÍ, dentro de la clase, es donde usas inject()
  
miNavegacion: Router = inject(Router);

usuario: string= ``;
contrasena: string= ``;


entrar():void {

    if(this.usuario==`produ02` && this.contrasena==`erat1027`) {
          
        this.miNavegacion.navigate(['/principal']);
      }
  }
}

```
----

**HTML**

```HTML
<input [(ngModel)]="usuario" placeholder="Usuario">
<input [(ngModel)]="contrasena" type="password" placeholder="Contraseña">
<button (click)="entrar()">Entrar</button>
```
- placeholder: Es el texto gris que aparece dentro del input cuando está vacío — como guía para el usuario
- solo va el mismo nombre que se establecio en el ts. 
