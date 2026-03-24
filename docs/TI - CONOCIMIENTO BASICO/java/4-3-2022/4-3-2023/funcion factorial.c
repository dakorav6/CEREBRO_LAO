//PROGRAMA QUE ME PERMITA CALCULAR EL FACTORIAL DE 2 NUMEROS
#include <stdio.h>

int calculo_factorial (int a);

int main(){
	
	int x,y, factorial1, factorial2;
	
	printf("Introduce el primer numero para calcular el fatorial: ");
	scanf("%i",&x);
	printf("Introduce el segundo numero para calcular el fatorial: ");
	scanf("%i",&y);
	
	factorial1=calculo_factorial(x);
	factorial2=calculo_factorial(y);
	
	printf("\tEl resultado del primer numero es: %i\n",factorial1);
	printf("\tEl resultado del segundo numero es: %i\n",factorial2);
	system("pause");
	return 0;
}

int calculo_factorial (int a){
	int i, aux;
	
	aux=1;
	
	for(i=1;i<=a;i++){
		aux=aux*i;
		//aux*=i;
	}
	
	return aux;
	
}
