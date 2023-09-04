#include <stdio.h>
#include <stdlib.h>

int main()
{
     int i, j, n;
      printf("Masukkan jumlah baris: ");
      scanf("%d",&n);
      for (i = 0; i < n; i++)
      {
            for (j = 0; j < n; j++)
            {
                  if (i %2 == 1 ){
                            printf(" ");
                         printf("*");                         
                  }else{
                          printf("*");
                          printf(" ");
                  }
            }
             printf("\n");
      }
    return 0;
}