# Ventana Modal

Una ventana modal que contenga un componente. 

>MatDialog es un servicio de Angular Material. Vive en el injector. Lo pides, te entrega un objeto que sabe abrir ventanas modales. La ventana no es HTML tuyo — es un componente que Angular monta dinámicamente encima de la vista actual.


>El MatDialog no deben ser listados en el array imports del decorador @Component , es un servicio de Angular, no un módulo. Los servicios se inyectan en el constructor de la clase.

>El componente que queremos mostrar en la ventana modal tampoco debe ser puesto en el decorador @Component. Solo lo importamos. 

## Proceso

1. Importar MatDialogModule y MatDialo

>Las animaciones, el backdrop oscuro detrás, el contenedor de la ventana, el comportamiento de cierre. Todo eso viene con MatDialogModule.

>MatDialog es el servicio que tiene el método .open(). Sin inyectarlo no puedes llamar this.dialog.open(nomComp).


*Componente que activa la ventana modal*
```typescript
// app.module.ts
import { MatDialogModule , MatDialog } from '@angular/material/dialog'; //ABRIR VENTANA MODAL
import { Login } from '../login/login'; // SOLO IMPORTAMOS EL COMPONENTE A MOSTRAR EN LA VENTANA MODAL , NO VA EN @COMPONENT
 
@Component({
  imports: [
    MatDialogModule
  ]
})

export class NavBarComponent {
    public readonly appName = 'MiApp';

    private dialog = inject(MatDialog); //Variable para open()



login():void {
    
  this.dialog.open(login);

}

}
/*
this.dialog.open(LoginComponent, {
  width: '400px',
  height: '300px'
});
*/

```
>No. No va en app.routes.ts. => app.routes.ts es exclusivamente para rutas — paths de URL y sus componentes correspondientes. El componente que que queremos montar en una ventana modal no tiene una URL en tu caso. No navegas hacia él. Lo montas dentro de un modal.


> la ventana de cierra sola cuando le das clic fuera de la ventana 


**HTML**
```HTML
<button (click)="login()">Iniciar sesión</button>

```


-------
## Cerrar ventana Modal

*Trabajamos en la Componente que muestra la ventana Modal*

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
        this.dialogRef.close();    // 1. cierra el modal  
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

