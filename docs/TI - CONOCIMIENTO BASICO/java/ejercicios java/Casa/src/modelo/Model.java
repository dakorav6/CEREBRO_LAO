
package modelo;


public class Model {
    
    private String [] color; 
    private float precio;
    private int numeroCuartos;
    
    
    public Model(){
    
    this.precio=6000.45f;
    this.numeroCuartos=5;
    
}
    public Model(String[] color){
    this.color=color;
    
    }
    public void setcolor(String [] color){
    this.color=color;
    }
   
   public float getprecio(){  
       return this.precio;
   }
   public void setNumeroCuartos(int numero){
   this.numeroCuartos=numero;
   
   }
   public void setPrecio(float precio){
   this.precio=precio;
   }
   public void mostrarDatos(){
    System.out.println("///////////////////////////////////");
   System.out.println("Informacion de Casa modelo :  \ncolores:  "+this.color[0]+","+this.color[1]+","+this.color[2]);
   System.out.println("precio:"+this.precio+"\n numero de cuartos: "+this.numeroCuartos);
   }
}
