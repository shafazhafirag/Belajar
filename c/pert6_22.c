#include <stdio.h>

int main(){
  int i = 1;
  while (i <= 20){
    printf("%d\t ",i);
    if (i %5 == 0){
    printf("\n");
    }
    i++;
  }
  }