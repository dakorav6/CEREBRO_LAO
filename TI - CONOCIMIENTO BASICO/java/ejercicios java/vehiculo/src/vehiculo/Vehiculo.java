
package vehiculo;

import java.util.Scanner;


public class Vehiculo {
    private int anio;
    private float precio;
    private String marca;

    public int getAnio() {
        return anio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(){
    
    }
    
    public Vehiculo(int anio, String marca) {
        this.anio =anio;
        this.marca=marca;
    
    }
   public void calcularPrecio(){
   if(this.anio<=2019){ this.precio=20000f;}
   if(this.anio>2019 && this.anio<=2021 ){ this.precio=2500f;}
   if(this.anio>=2022){ this.precio=35000f;}
   
   }
   public void mostrar(){
   System.out.println("El carro es del anioo:"+this.anio+"  de la marca: "+this.marca + " con un valor de :"+this.precio);
   
   }
   public void ingresar( ){
   Scanner dato=new Scanner(System.in);
    
    System.out.println("Ingrese el anio:");
    this.anio=dato.nextInt();
    Scanner dato2=new Scanner(System.in);
    System.out.println("Ingrese marca:");
    this.marca=dato2.nextLine();

   }
   
    
   
    
    public static void main(String[] args) {
    
        Vehiculo carrito = new Vehiculo(1995,"hyundai" );
        
        carrito.calcularPrecio();
        carrito.mostrar();
        Vehiculo carrito2=new Vehiculo();
        carrito2.ingresar();
        carrito2.calcularPrecio();
        carrito2.mostrar();
       
        
    }
    
    
    
}
