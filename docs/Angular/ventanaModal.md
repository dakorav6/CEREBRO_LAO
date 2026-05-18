# Ventana Modal

Una ventana modal que contenga un componente. 

>MatDialog es un servicio de Angular Material. Vive en el injector. Lo pides, te entrega un objeto que sabe abrir ventanas modales. La ventana no es HTML tuyo — es un componente que Angular monta dinámicamente encima de la vista actual.

## Proceso

1. Importar MatDialogModule


```typescript
// app.module.ts
import { MatDialogModule } from '@angular/material/dialog';
import { Login } from '../login/login';  //NUESTRA COMPONENTE


@Component({
  imports: [
    MatDialogModule
  ]
})

export class NavBarComponent {


private dialog = inject(MatDialog);

 abrirLogin(): void {
    this.dialog.open(Login )
  }


}


```
>No. No va en app.routes.ts. => app.routes.ts es exclusivamente para rutas — paths de URL y sus componentes correspondientes. El componente que que queremos montar en una ventana modal no tiene una URL en tu caso. No navegas hacia él. Lo montas dentro de un modal.

