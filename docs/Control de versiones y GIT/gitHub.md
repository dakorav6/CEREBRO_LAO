

## Instalacion y mesa de trabajo

-`winget install --id Git.Git -e --source winget` =>  Instalar Git para Windows: Es el motor que permite que tu PC hable con GitHub. Puedes descargarlo en el buscador del navegador 

### Confirmacion de identidad para hacer commit fuera del entorno github como en el escritorio por ejemplo.
1. Configura tu nombre:
git config --global user.name "Tu Nombre"

2. Configura tu correo: (Es recomendable usar el mismo correo de tu cuenta de GitHub)
git config --global user.email "tu@email.com"

3. al momento de hacer commit te va a pedir confirmacion de identidad, que eres el dueño del repostorio , de ser el caso solo haces commit directamente en el main si queires. 

    *es solo referencial la informacion, puede ser cualquier nombre o correo*


### Se recomienda no trabajar directamente sobre el main, como trabajamos con ramas? 




### Trabajar con otros repositorios de otr autor 

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

