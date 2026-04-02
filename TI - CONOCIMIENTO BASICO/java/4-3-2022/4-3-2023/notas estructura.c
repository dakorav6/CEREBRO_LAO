//PROGRAMA PARA ALMACENAR LAS NOTAS DE UN ALUMNO DE VARIAS ASIGNATURAS

#include<stdio.h>

typedef struct{
	int matematicas;
	int ingles;
	int fisica;
}notas;

int main(){
	notas not;
	darnotas(not);
	
	system("pause");
	return 0;
}

void darnotas (notas not){
	printf("Introduzca la nota de Matematicas: ");
	scanf("%i",&not.matematicas);
	
	printf("Introduzca la nota de Ingles: ");
	scanf("%i",&not.ingles);
	
	printf("Introduzca la nota de Fisica: ");
	scanf("%i",&not.fisica);
	
	
	printf("La nota de matematicas es: %i\n",not.matematicas);
	printf("La nota de ingles es: %i\n",not.ingles);
	printf("La nota de fisica es: %i\n",not.fisica);
}
