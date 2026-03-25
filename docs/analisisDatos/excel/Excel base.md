
- generar numero aleatorio en un rango específico
- quitar fondo cuadriculado desde la pestaña view - show - gridlines
- podemos configurar la columna de campo moneda dándole clic derecho en cualquier cuadro de la columna - formato de numero - moneda (y eso modifica toda la columna)
- CTRL+E para seleccionar toda una tabla 


# Tabla
- al momento de establecer un diseño de tabla podemos usar nuestro header ya establecido justo despues de seleccionar el diseño te sale un recuadro y le das al cuartito de visto. 
- Pestaña **Diseño de tabla** - estilo de tabla - tenemos la opcion de añadir un total al pie de la tabla - sombrear la ultima columna - 
- **ordenar por el tipo**  seleccionamos la tabla (CTRL+E) - pestaña **Datos** - Ordenar - Ordenar por


# Funciones 
nota: las funciones cambian si el Excel esta en ingles o español 
- **numero aleatorio** => ``=ALEATORIO.ENTRE(18, 60)`` 
	- ingles seria: ``=RANDBETWEEN(10, 100)``
	- nota: los números van a cambiar cada ves que modifique algo si quiere que los valores queden estáticos solo copie o corte y pegue la columna
	- buscarv() => esta formula es la polla 

# Tabla dinámica 

Una **tabla dinámica** en Excel es una herramienta poderosa que te permite **resumir, analizar, explorar y presentar** grandes cantidades de datos de forma rápida y flexible.
Una **tabla dinámica** crea una nueva tabla que **resume datos automáticamente** con funciones como SUMA, PROMEDIO, CUENTA, etc. Se basa en los datos de una tabla ya existente. 

Es una tabla interactiva que:
- **Agrupa y resume** datos.
- Te permite **filtrar, ordenar y reorganizar** la información fácilmente.
- **No modifica los datos originales**, solo los representa de forma distinta.

### 🛠️ ¿Cómo crear una tabla dinámica?

1. Ve a **Insertar > Tabla dinámica**. 
2. Elige si quieres la tabla en una nueva hoja o en la misma. 
3. Usa el panel derecho para arrastrar:
    - **Filas** → lo que quieres agrupar (por ejemplo, productos).
    - **Columnas** → categorías secundarias (por ejemplo, meses).
    - **Valores** → lo que quieres calcular (por ejemplo, suma de ventas).
    - **Filtros** → para segmentar los datos (por ejemplo, por país o año).

Las tablas dinámicas nos podrán ayudar a resolver situaciones como esta:   
Punto 1: presentar un informe de tabla dinámica en donde se muestre el total de la venta por tipo de cliente, linea y producto.
Punto 2: presentar un informe de tabla dinámica en donde se muestre el total de la venta por cada vendedor.|


# Esquema 
nos ayudan a ocultar o mostrar información en nuestra tabla, resulta útil cuando tenemos un gran volumen de informacion y queremos ver algo en especifico. 
Pestaña:**Datos** => Esquemas => (agrupar,desagrupar y subtotal)

- **agrupar y desagrupar**:  no le veo un uso real la verdad o.0, solo esconde o muestra columnas o celdas con un icono de despliegue. 
-  **subtotal**: si le veo uso, ya que agrupa la información por un tipo en especifico dandonos como resultado una tabla por secciones agrupadas segun el tipo y separados por un subtotal que seria la suma de cada agrupacion. Asi mismo estas secciones estan separadas por un icono de despliegue.
	- nota: esto no se puede hacer con tablas con diseño de colores que vienen por defecto en el excel, si es raro el esquema 

# Formato condicional
- **caso de uso**: sirve cuando queremos establecer una condicional para que marque una celda bajo una cierta condición (>,< ,>=,<= etc..)
- Pestaña:**Inicio** => Estilos => Formato condicional



