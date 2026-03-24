#include<stdio.h>

void factorial();

int main(){
	
	factorial();
	
	system("pause");
	return 0;
}


void factorial(){
	int x,i,aux;
	
	aux=1;
	
	printf("Introduce un numero entero: ");
	scanf("%i",&x);
	
	for(i=1;i<=x;i++){
		aux*=i;
	}
	printf("El factorial del numero %i es: %i \n",x,aux);
	
}
