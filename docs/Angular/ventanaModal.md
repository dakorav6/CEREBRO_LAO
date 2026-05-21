# Ventana Modal

Una ventana modal que contenga un componente. 

>MatDialog es un servicio de Angular Material. Vive en el injector. Lo pides, te entrega un objeto que sabe abrir ventanas modales. La ventana no es HTML tuyo — es un componente que Angular monta dinámicamente encima de la vista actual.


>El MatDialog es un servicio de Angular, no un módulo. Los servicios se inyectan en el constructor de la clase (o usando la función inject() en Angular 14+), pero no deben ser listados en el array imports del decorador @Component. El módulo correcto a importar para usar el servicio MatDialog es MatDialogModule.


## Proceso

1. Importar MatDialogModule y MatDialo

>Las animaciones, el backdrop oscuro detrás, el contenedor de la ventana, el comportamiento de cierre. Todo eso viene con MatDialogModule.

>MatDialog es el servicio que tiene el método .open(). Sin inyectarlo no puedes llamar this.dialog.open().

```typescript
// app.module.ts
import { MatDialogModule , MatDialog } from '@angular/material/dialog';
import { Login } from '../login/login';

@Component({
  imports: [
    MatDialogModule
  ]
})

export class NavBarComponent {
    public readonly appName = 'MiApp';

    private dialog = inject(MatDialog);

login():void {

  this.dialog.open(Login);

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