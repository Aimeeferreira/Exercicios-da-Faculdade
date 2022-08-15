#include <stdio.h>
#include <stdlib.h>

int main () {
	float nota1, nota2, media;
	printf ("Informe aqui a primeira nota: ");
	scanf ("%f", &nota1);
  
	printf ("Informe aqui a segunda nota: ");
	scanf ("%f", &nota2);
  
	media = (nota1 + nota2) / 2;
  
	if (media >= 7 && media < 10) {
		printf ("Aprovado\n");
	}
  
    else if (media <7) {
		printf ("Reprovado\n");
	} 

    else{
	printf ("Aprovado com Distincao\n"); 
    }
  
	system ("pause");
	return 0;
}
