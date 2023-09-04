#include <stdio.h>
#include <stdlib.h>

int main(void){
  printf("## Bahasa C Persegi Panjang Bintang ## \n");
  printf("============================================== \n\n");

  int tg,lb,i,j;

  printf("Input tinggi : ");
  scanf("%d",&tg);
  printf("Input lebar  : ");
  scanf("%d",&lb);

  printf("\n");

  for(i=1; i<=tg; i++) {
    for(j=1; j<=lb; j++) {
      printf("*");
    }
    printf("\n");
  }
    return 0;
}