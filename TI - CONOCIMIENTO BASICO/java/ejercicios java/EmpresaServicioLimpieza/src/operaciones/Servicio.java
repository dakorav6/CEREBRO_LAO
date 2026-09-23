
package Operaciones;

import java.util.Scanner;


public class Servicio {
    
    private float metroCuadrado;
    private float[] sitio;//[0]casa,edificio[1],localComercial[2],centroEducativo[3],parque[4]
    private int tipo;
    private String datosCliente;
    private int codigoFactura;
    
    
    public Servicio(){
   //sitio={1,2,2,2,2}; por que no se puede :c
           
     sitio=new float[5];
    sitio[0]=2.99f;
    sitio[1]=3.99f;
   sitio[2] =4.99f;
    sitio[3]=5.99f;
    sitio[4]=6.99f;
    }
   public Servicio( Scanner metroCuadrado){
    System.out.println("Ingreso los metros cuadrados para el calculo de una casa:");
    this.metroCuadrado=metroCuadrado.nextFloat();
    this.tipo=1;
    sitio=new float[5];
     sitio[0]=2.99f;
    sitio[1]=3.99f;
   sitio[2] =4.99f;
    sitio[3]=5.99f;
    sitio[4]=6.99f;
   }
    
public void ingresoTipo(Scanner dato){
do{
System.out.println("Ingrese el tipo de lugar para realizar el servicio:\n1.-casa\n2.-edificio\n3.-Local Comercial\n4.-Centro Educativo\n5.-Parque\nIngrese el numero de opcion  ");
this.tipo=dato.nextInt();
}while(!(this.tipo==1 || this.tipo==2 || this.tipo==3 || this.tipo==4 || this.tipo==5));
}
public void ingresoMetrosCuadrados(Scanner dato){
System.out.println("Ingrese los metros cuadrados a trabajar ");
this.metroCuadrado=dato.nextFloat();
}
public float totalServicio(){
float dato = 0;
switch(this.tipo){
    case 1: dato=this.sitio[0]*this.metroCuadrado     ;break;
    case 2:  dato=this.sitio[1]*this.metroCuadrado      ;break;
    case 3:   dato=this.sitio[2]*this.metroCuadrado     ;break;
    case 4:  dato=this.sitio[3]*this.metroCuadrado      ;break;
    case 5:  dato=this.sitio[4]*this.metroCuadrado      ;break;
}
        return dato;

}
 //ESTO ES TESTEO
public String GETmostrarPrecios(){
//System.out.println("el numero ingreado es: "+this.tipo);
return "CASA:$"+this.sitio[0]+" EDIFICIO: $"+this.sitio[1] +" LOCAL COMERCIAL $"+ this.sitio[2]+" CENTRO EDUCATIVO: $" +this.sitio[3]+" PARQUE: $"+this.sitio[4]  ;
}
//Si en el sistema se requiere modificar los precios 
public void SETmodificarPrecios(float casa,float edificio,float localComercial, float centroEducativo,float parque){
this.sitio[0]=casa;
this.sitio[1]=edificio;
this.sitio[2]=localComercial;
this.sitio[3]=centroEducativo;
this.sitio[4]=parque;

}

///////////////////////////////////////////////////////////////////////////////////////////
//METODOS SETTERS Y GUETTERS

public float GETmetrosCuadrados(){
return this.metroCuadrado;
}
public int GETtipo(){
return this.tipo;
}
public String GETdatosCliente(){
return this.datosCliente;
}int GETcodigoFactrua(){
return this.codigoFactura;
}
////////////////////////////////////////////////////////
public void SETmetrosCuadrados(float metrosCuadrados){
this.metroCuadrado=metrosCuadrados;
}
public void SETtipo(int tipo){
this.tipo=tipo;
}
public void SETdatosCliente(String datosCliente){
this.datosCliente=datosCliente;
}
public void SETcodigoFactura(int codigoFactura){
this.codigoFactura=codigoFactura;
}
}
    