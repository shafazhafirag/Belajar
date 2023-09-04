#include <stdio.h>

int main(){
  int i = 1;
  for (i <= 20;i++){
    printf("%d\t ",i);
    if (i %5 == 0){
    printf("\n");
    }
    i++;
  }
  }