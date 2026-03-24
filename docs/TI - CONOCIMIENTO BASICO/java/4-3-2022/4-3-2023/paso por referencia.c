#include <stdio.h>

int sumarXvalor(int a,int b);
void sumarXreferencia(int a,int b,int *resultado);
int main(){
    int a=5;
    int b=2;
    int resultado=0;
    printf("Valores:\n%i\n%i\n",a,b);
    printf("Paso de Parametros por Valor\n");
    resultado = sumarXvalor(a,b);
    printf("Resultado: %i\n",resultado);
    printf("Paso de Parametros por Referencia\nPasamos el valor de posicion en memoria de la variable resultado: %p\n",&resultado);
    sumarXreferencia(a,b,&resultado);
    printf("Resultado: %i\n",resultado);
    return 0;
}
int sumarXvalor(int a, int b){
    return a+b;
}
void sumarXreferencia(int a,int b,int *resultado){
    *resultado = a + b;
}
