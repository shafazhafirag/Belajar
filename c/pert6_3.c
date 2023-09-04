#include <stdio.h>
#include <stdlib.h>

int main(void){

  int i,j;
  int t=1;


  for(i=1; i<=4; i++) {
    for(j=1; j<=5; j++) {
      printf("%d ",t);
      t++;
    }
    printf("\n");
  }
    return 0;
}