

## Instalacion y mesa de trabajo

-`winget install --id Git.Git -e --source winget` =>  Instalar Git para Windows: Es el motor que permite que tu PC hable con GitHub. Puedes descargarlo en el buscador del navegador 


## Clonar un Repositorio 
Podemos clonar cualquier repositorio de GITHUB que sea publico.
1. en la pagina opc. "CODE" copiamos el URL
2. consola: `git clone https://github.com/tu-usuario/tu-repositorio.git`

### El flujo de trabajo completo
Una vez que tienes tu fork en la computadora, el proceso es el mismo que con tus propios proyectos:

1. Modificas el código en Visual Studio Code.

2. Preparas los cambios: `git add .`

3. Confirmas: `git commit -m "Mejoré el código"`

4. Subes a TU copia: `git push origin main`



## Hacer commit y push en consola

1. `git add .`

2. `git commit -m "Avances del día"`

3. `git push origin main`

- `git push origin main --force` => para forzar el push :D



### Como actulaizar o sincronicar con los cambios que estan subidos en el repositorio. 

`git pull origin main`


## Crear Ramas 

### Opcion 1 : por consola
1. consola: `git checkout -b nombre-de-la-rama`  (crea y te hubica en ella)
2.  `git push -u origin nombre-de-tu-rama` cuando es la primera vez,o la rama es nueva debemos hacer un push, porque no existe en github y debemos que crearla. 

### Opcion 2: Desde Visual Studio Code (Visual)
Si prefieres no usar comandos, VS Code lo hace muy sencillo:

1. Haz clic en el nombre de la rama actual (abajo a la izquierda, donde suele decir main).

2. Se abrirá un menú arriba; selecciona "+ Crear nueva rama..." (o Create new branch).

3. Escribe el nombre de tu rama y presiona Enter.

**Y el push?**
como la rama es nueva debemos de crearla en github
    *Después de hacer tu Commit, verás que en la esquina inferior izquierda (donde está el nombre de tu rama) aparece un icono de una nube con una flecha hacia arriba o un botón azul que dice Publicar rama (Publish Branch).*


## Confirmacion de identidad para hacer commit fuera del entorno github como en el escritorio por ejemplo.
1. Configura tu nombre:
git config --global user.name "Tu Nombre"

2. Configura tu correo: (Es recomendable usar el mismo correo de tu cuenta de GitHub)
git config --global user.email "tu@email.com"

3. al momento de hacer commit te va a pedir confirmacion de identidad, que eres el dueño del repostorio , de ser el caso solo haces commit directamente en el main si queires. 

    *es solo referencial la informacion, puede ser cualquier nombre o correo*


## Se recomienda no trabajar directamente sobre el main, como trabajamos con ramas? 




## Trabajar con otros repositorios de otro autor 

1. en la opcion **FORK** del repositorio de otro autor , copiamos el repositorio a nuestra cuenta.  

3. clona tu copia (la que está en tu perfil) a tu computadora , Realiza tus cambios en el código, guarda los archivos y sigue el proceso que ya conoces.

2.Crear el Pull Request (La propuesta)
Una vez que subas los cambios a tu GitHub, entra a la página del repositorio original del autor. Verás que GitHub detecta que subiste algo y te mostrará un botón amarillo que dice "Compare & pull request".
Escribe un mensaje explicando por qué tu cambio es útil para el proyecto.y envía la solicitud.



## Instrucciones en consola

- Crear carpeta =>	`$mkdir nombreCarpeta` 
- Retroceder una carpeta =>	`cd..`
- Acceder carpeta =>	`cd carpetaQueQuieresAcceder`
- Lista de carpetas o archvios=> `ls`
- Cambiar nombre=> `$git  remote rename  nombreArchivo  NuevoNombreArchivo`
- Limpiar Consola => `clear`



## Procesos 

- Clonar Repositorio =>  `git clone https://github.com/dakorav6/PRACTICAS_LAO.git`

