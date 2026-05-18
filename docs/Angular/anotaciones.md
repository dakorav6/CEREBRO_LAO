>el ngif

>En Angular moderno, si utilizas la propiedad imports dentro del decorador @Component, el componente debe ser standalone. Si no lo marcas como tal, Angular no "ve" los componentes que intentas importar (como el Footer o NavBarComponent), y por eso dice que <app-footer> no es un elemento conocido.

```
:void es solo una anotación de tipo. Le dice a TypeScript explícitamente que el método no devuelve nada.
typescript// Con void — explícito
abrirLogin(): void {
  this.dialog.open(LoginComponent);
}

// Sin void — implícito
abrirLogin() {
  this.dialog.open(LoginComponent);
}
TypeScript infiere el tipo de retorno aunque no lo declares. Si no hay return, asume void solo.

```