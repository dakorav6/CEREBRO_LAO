

- Docker sirve para aislar aplicaciones y hacer que funcionen igual en cualquier máquina.
- ¿Qué pasa si borro el contenedor? Desaparece todo lo que estaba dentro. Por eso existen los volúmenes.Un volumen es una carpeta de tu computadora que Docker utiliza para guardar datos. El contenedor solo accede a ese carpeta. "El contenedor solo accede a esa carpeta."
- no es una nube
- como sabes que es mio?  no hay cuentas de por medio solo tu computadora. 
- Cuando Docker crea un contenedor a partir de una imagen, también crea un sistema de archivos para ese contenedor en la comutadora donde estamos trabajando.

Docker trabaja con estas piezas: 
- Imagen → la plantilla (como un archivo ISO o una receta).
- Contenedor → una instancia en ejecución creada a partir de esa plantilla.
- Volumen → el lugar donde los datos persisten aunque destruyas el contenedor.







## Existe 2 formas de guardar archivos:


### Primera forma Volumen Docker (DOCKER de forma interna)

- creacion de la carpeta "VOLUMEN":`docker volume create mis_datos`
- verificar si existe el archivo: `docker volume ls`



>No recuperas la información entrando al directorio del volumen. La recuperas montando ese volumen en otro contenedor.

### Segunda forma(carpeta fuera del contenedor):
>Un contenedor NO tiene acceso a los archivos de tu computadora por defecto, TENEMOS QUE DARLE PERMISO.


------------------------------------------

# Creacion del Contenedor con un programa 



```bash
docker run  \
-e "ACCEPT_EULA=Y" \
-e "MSSQL_SA_PASSWORD=Cualquiercosa123." \
-p 1433:1433 \
--name sqlserver \
-d mcr.microsoft.com/mssql/server:2022-latest
```

**Qué hace esto**
- Docker run (Crear nuevo contenedor)
- ACCEPT_EULA=Y (aceptar todas las licencias)
- MSSQL_SA_PASSWORD  (contraseña del usuario SA, debe tener: 8 caracteres , mayuscula , minuscula, numero y caracter especial)
- p 1433:1433  (expone el puerto)
- name sqlserver (nombre del contenedor.)
- d mcr.microsoft.com/mssql/server:2022-latest (IMAGEN UTILIZADA)

---------------------------------------------------
docker exec [opciones] <contenedor> <programa>

docker exec -it sqlserver bash




-------

# Creacion de un contenedor Ubuntu y gestionar de archivos externos del contenedor


