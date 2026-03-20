
package empresaserviciolimpieza;

import Operaciones.Servicio;
import java.util.Scanner;



public class EmpresaServicioLimpieza {

   
    public static void main(String[] args) {
       //Objeto 1 Constrcutor por defecto
       System.out.println( "Objeto 1");
       Servicio paqueteCompra;
       paqueteCompra=new Servicio();
       System.out.println( paqueteCompra.GETmostrarPrecios() );//MOSTRAR PRECIOS 
       paqueteCompra.ingresoTipo(new Scanner(System.in));//Ingreso por consola de tipo de lugar:casa,edificio,parque...
       paqueteCompra.ingresoMetrosCuadrados(new Scanner(System.in));//ingreso de valor flotante de metros cuadrados 
       System.out.println("El total es: $"+paqueteCompra.totalServicio());//TESTEO
       System.out.println( "Cambiando precios dentro del sistema...");
       paqueteCompra.SETmodificarPrecios(10, 20, 30, 40, 50);
       System.out.println( paqueteCompra.GETmostrarPrecios() );//MOSTRAR PRECIOS 
      
       //objeto 2 constructor parametrizado
       System.out.println( "///////////////////////////////////////////////////" );
       System.out.println( "Objeto 2");
       
       Servicio paqueteCompraCasa;
       paqueteCompraCasa=new Servicio(new Scanner(System.in));
       System.out.println("El total es: $"+paqueteCompraCasa.totalServicio());      
    }
    
}