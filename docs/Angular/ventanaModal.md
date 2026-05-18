# Ventana Modal

Una ventana modal que contenga un componente. 

>MatDialog es un servicio de Angular Material. Vive en el injector. Lo pides, te entrega un objeto que sabe abrir ventanas modales. La ventana no es HTML tuyo — es un componente que Angular monta dinámicamente encima de la vista actual.

## Proceso

1. Importar MatDialogModule


```typescript
// app.module.ts
import { MatDialogModule } from '@angular/material/dialog';

@NgModule({
  imports: [
    MatDialogModule
  ]
})
```

