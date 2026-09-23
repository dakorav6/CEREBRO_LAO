
package zapato;

/**
 *
 * @author jordan Orbe
 */
public class Zapato {
int talla;
String marca;
String tipo;
float precio;

void mostrarDatos(){

System.out.println("El zapato tiene estas caracteristicas: \n TIPO:" +  tipo +"\n Talla:"+ talla +"\n Marca:"+ marca +"\n Precio:"+ precio   );

}
void cambiarPrecio(float num){
precio=num;

}
void calcularIva(){
    
    System.out.println("El inva es:  " + String.format("%.2f", precio*0.12)  );
                    }
    public static void main(String[] args) {
       Zapato model = new Zapato();
       
       model.marca="guchi";
       model.talla=29;
       model.precio=50.52F;
       model.tipo="deportivo";
       
      
       model.mostrarDatos();
       model.calcularIva();
       model.cambiarPrecio(80.35F);
       model.mostrarDatos();
       model.calcularIva();
         
                                            }  
}
