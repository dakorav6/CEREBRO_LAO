//ORDENAR UN VECTOR DE 10 ELEMENTO DE MENOR A MAYOR MEDIANTE UNA FUNCION

#include<stdio.h>

void fun(int a[]);
void imprimir (int x[]);

int main(){
	int v[2];
	
	fun(v);//VECTORES NO NECESITAN PASO POR REFERENCIA
	imprimir(v);
	
	system("pause");
	return 0;
}

void fun (int a[]){
	int i;
	
	for (i=0;i<2;i++){
		
		printf("Introduce un valor: ");
		scanf("%i",&a[i]);
		
	}
	
}


void imprimir (int x[]){
	int i;
	
	for(i=0;i<2;i++){
		printf("%i, ",x[i]);
		
	}
	
	printf("\n");
}
