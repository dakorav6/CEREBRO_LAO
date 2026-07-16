
- El problema que resuelve: "En mi computadora funciona.", Docker hace que funcione igual en cualquier máquina.
- Docker sirve para aislar aplicaciones y hacer que funcionen igual en cualquier máquina.
- ¿Qué pasa si borro el contenedor? Desaparece todo lo que estaba dentro. Por eso existen los volúmenes.Un volumen es una carpeta de tu computadora que Docker utiliza para guardar datos.  "El contenedor solo accede a esa carpeta."
- no es una nube
- como sabes que es mio?  no hay cuentas de por medio solo tu computadora. 
- Cuando Docker crea un contenedor a partir de una imagen, también crea un sistema de archivos para ese contenedor en la comutadora donde estamos trabajando.

- Docker nace con la configuracion que le asignemos , eso quiere decir que si queremos trabajar con volumen o un archivo de respaldo externo tenemos que definir el comando para que sea con volumen o respaldo. "Una vez creado, Docker no permite modificar esa configuración."
- "Los contenedores estan pensados para ser desechados"
- en proyecto reales no creamos contenedores por la consola???? lo creamos en un archivo ????'


**Docker trabaja con estas piezas:**
- Imagen → la plantilla (como un archivo ISO o una receta).
- Contenedor → una instancia en ejecución creada a partir de esa plantilla o imagen. 
- Datos (Volumen) → el lugar donde los datos persisten aunque destruyas el contenedor.


**REGLA DE DOCKER:**
- Regla Docker: "Un contenedor vive mientras su proceso principal esté ejecutándose, eso quiere decir que ejecutamos un contenedor con el programa."
- un contenedor no es una maquina virtual, por que? por que No arrancar un sistema operativo completo,Solo ejecut el programa que se le indica, por eso que cuando queremos usar ubunto ejecutamos tambien el bash. 





## Existe 2 formas de guardar archivos:


### Primera forma Volumen Docker (DOCKER de forma interna)

- creacion de la carpeta "VOLUMEN":`docker volume create mis_datos`
- verificar si existe el archivo: `docker volume ls`



>No recuperas la información entrando al directorio del volumen. La recuperas montando ese volumen en otro contenedor.

### Segunda forma "BIND MOUNT" (carpeta fuera del contenedor):
>Un contenedor NO tiene acceso a los archivos de tu computadora por defecto, TENEMOS QUE DARLE PERMISO.


------------------------------------------

## Creacion del Contenedor con un programa 



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



# SQL SERVER 





-------

# Creacion de un contenedor Ubuntu y gestionar de archivos externos del contenedor

1. Creamos una carpeta vacia 
2. descargamos imagen ubuntu: `docker pull ubuntu`
3. Crear el contenedor:  

```bash
docker run -it \
--name miubuntu \
-v $(pwd)/datos:/datos \
ubuntu bash

```

- Mucha gente cree que Docker crea una carpeta nueva "datos", Dentro del contenedor aparece una carpeta llamada"datos" pero esa carpeta es solamente el punto de montaje (mount point), es como google drive lo podemos ver desde mustiples dispositivos pero es el mismo archivo. 

- por parte de la carpeta fuera del contendor si tenemos que crearla , no hace falta que tengan el mismo nombre.  `mkdir datos`

-  la sintaxis siempre es : `-v origen:destino` , "No existen dos archivos.Existe un único archivo físico.Tú lo puedes abrir desde dos rutas diferentes."

-  -it : se usa para interactuar por consola con el programa  "Conecta mi teclado y mi pantalla al programa que se va a ejecutar dentro del contenedor." osea al bash


## Comandos CRUD archivo TXT en UBUNTO
- Crear archivo txt: `touch notas.txt`
- verificar lista: `ls`
- escribir el contenedo en el archivo
- Agregar contenido sin borrar lo anterior:`echo "Segunda línea" >> archivo.txt`
- Crear o reemplazar el contenido: `echo "Hola Mundo" > archivo.txt`
- leer un archivo : `cat archivo.txt`
- leer archivo: `less archivo.txt`
- salir: `q`

---------------------------------
## Comandos de consola

- existe algun contenedor? : `docker ps - a`
- existe algun contenedor en ejecucion: `docker ps`
- eliminar el contenedor: `docker rm cualNomb`
- salir consola: `exit`
- encender contenedor : `docker start nombContenedor`
- entrar en un contenedor que ya esta encendido: `docker exec -it miubuntu bash`
- Detenerlo o apagarlo.: `docker stop miubuntu`




-------------------------------------------------
