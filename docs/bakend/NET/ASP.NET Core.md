# ASP.NET Core Web API — Bases


*nota del examen: 

# DEFINICION
Framework de Microsoft para construir APIs HTTP con C# sobre .NET

# Instalacion y mesa de trabajo
<!-- Instalaciones, versiones, comandos de verificación. -->
<!-- Extensiones recomendadas con una línea de por qué cada una. -->

## Crear nuevo proyecto

1. Crear nuevo proyecto
2. escoger: ASP.NET CORE WEB API (C#)
3. al momento de darle nombre al proyecto, asegurate que al solucion y el proyecto tengan nombres distintos

4. **Crear el controlador:** clic DER. sobre la Solucion del proyecto/ agregar / nuevo proyecto / BIBLIOTECA DE CLASE / BCnombreCualquiera
5. Creamos las clases correspondentes en la BC (SEGUN COMO SE HAYA EXPOTADO EN EL FRONDEND ????? )


```CS
public class Equipos
{
    public int ID {get ; set;} ;
    public string nombre {get ; set; };
    public double? valorMercado{get ; set;} ;
    public string? clave {get ; set; }

}
```
6. *Contectamos los 2 apartados del proyecto:* apiProyecto y BCproyecto: clicDer_Solucion/agregar/referencia del Poryecto/escogemos el BC / 

7. **Creacion de Controladores:** enla carpeta Controllers/clicDer/agregar conrolador / controlador de MVC con acciones de lestura o escritura / nombreController.cs / nos da un controlador lleno , borremos todo y empecemos en blanco.

>nota: con Charco nos vamos a enfocar en get y post , que login que usamos y porque?
 
```ts
namespace APInombProyectoController 
{
    public class EquiposController:Controller
    {
        public async 



    }


}
```

> nota: aqui no estaos usando ENTITY FRAMEWORK eso lo dejamos para despues




# Nomenclatura y conceptos base
<!-- Vocabulario mínimo para leer código de esa tecnología. -->

-asincronica: las apis son asincronicas , osea no dependen de nadie.



# ESTRUCTURA DEL PROYECTO 
<!-- Árbol de carpetas. Qué vive dónde y por qué. -->

CARPETA CONTROLLERS: va los controladores
Biblioteca de calse: clases

# Cómo funciona (flujo interno)
<!-- Ciclo de vida, cadena de procesos, cómo se conectan las piezas. -->

## Cómo se usa (patrones recurrentes)
<!-- Los 3-5 patrones que aparecen en el 80% del trabajo real. -->
<!-- Cada uno con ejemplo mínimo ejecutable. -->

# MINI PROYECTO REAL
<!-- Propón un proyecto pequeño pero realista para practicar el tema debe ayudar a consolidar conceptos.-->


# Pendientes / por explorar

<!-- que es lo que sigue? -->
<!-- cuales son los temas mas relevantes o importantes, aplicables en un entorno de trabajo real que tenga que ver con el tema principal -->

