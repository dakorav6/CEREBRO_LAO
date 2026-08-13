//PROGRAMA PARA COMPROBAR SI DOS NUMEROS SON PRIMOS
#include <stdio.h>

int calculo_factorial (int a);

int main(){
	int x,y, primo1, primo2;
	
	printf("Introduce primer numero: ");
	scanf("%i",&x);
	
	printf("Introduce segundo numero: ");
	scanf("%i",&y);
	
	primo1=primo(x);
	primo2=primo(y);
	
	if (primo1==0){
		printf("El numero %i es primo\n",x);
	}
	else {
		printf("El numero %i no es primo\n",x);
	}
	
	if (primo2==0){
		printf("El numero %i es primo\n",y);
	}
	else {
		printf("El numero %i no es primo\n",y);
	}
}

int primo (int a){
	int i,j,aux;
	
	j=0;
	
	for(i=2;i<a&&j==0;i++){
		aux=a%i;
		
		if(aux==0){
			j=1;
		}
		
	}
	return j;
}
