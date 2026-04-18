
package casa;

import modelo.Model;

public class Casa {

    public static void main(String[] args) {
        
        String [] colores={"azul","amarillo","rojo"};
        String [] coloresDos={"blanco","amarillo","negro"};
       
        Model modeloUno = new Model(colores);
        Model modeloDos=new Model() ;
        
       // modeloUno.setNumeroCuartos(20);
        //modeloUno.setPrecio(70000.92f);
        modeloDos.setcolor(coloresDos);
        modeloUno.mostrarDatos();
        modeloDos.mostrarDatos();
        System.out.println("///////////////////////////////////");
        System.out.println("El precio de la casa modelo 1 es de:"+modeloUno.getprecio());
        System.out.println("El precio de la casa modelo 2 es de:"+modeloDos.getprecio());
    }
    
}
