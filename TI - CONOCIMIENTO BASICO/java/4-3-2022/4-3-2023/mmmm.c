//PROGRAMA QUE ME PERMITA CALCULAR EL FACTORIAL DE 2 NUMEROS
#include <stdio.h>

int factorial (int a);

int main(){
	
	int x,y, factorial1, factorial2;
	
	printf("Introduce el primer numero para calcular el fatorial");
	scanf("%i",&x);
	printf("Introduce el segundo numero para calcular el fatorial");
	scanf("%i",&y);
	
	factorial1=factorial(x);
	factorial2=factorial(y);
	
	printf("El resultado del primer numero es: %i\n",factorial1);
	printf("El resultado del primer numero es: %i",factorial2);
	
}

int factorial (int a){
	int i, aux;
	
	aux=1;
	
	for(i=1;i=a;i++){
		//aux=aux*i;
		aux*=i;
	}
	
	return aux;
	
}
