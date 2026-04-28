
Mientras que Angular Material es una librería de componentes (ladrillos técnicos), Bootstrap es un framework de diseño pensado para la rapidez y el diseño visual.

## ¿Se "debe" usar Bootstrap con Angular?

No es obligatorio, pero mucha gente lo hace por una razón: El sistema de rejilla (Grid).(es mas facil posicionar u organizar elementos con boopstrap)

Angular Material es increíble para hacer componentes individuales, pero no es tan intuitivo para ordenar esos componentes en la pantalla (poner tres tarjetas una al lado de la otra y que en el celular se vea una sola). Bootstrap, en cambio, es el rey de eso con sus clases container, row y col.


## Instalacion y mesa de trabajo


1. `npm install bootstrap` instalacion de bootstrap 

2. Configuración en Angular:

*Una vez instalado, debes "avisarle" a Angular que use los estilos de Bootstrap. Para esto, abre el archivo `angular.json` y busca la sección llamada `"styles"`. Agrégalo así:*

```json
"styles": ["node_modules/bootstrap/dist/css/bootstrap.min.css", 
            "src/material-theme.scss",
                        "src/styles.css"]
],
```

##  Cómo usarlo (Ejemplo Práctico: Login Centrado)

Ahora que lo tienes instalado, no necesitas importar módulos en el .ts. Simplemente usas las clases en el HTML en cada modulo que corresponda. 



## paginas para buscar plantillas 

https://bootsnipp.com/


