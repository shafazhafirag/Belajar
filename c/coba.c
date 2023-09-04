#include <stdio.h>
#include <stdlib.h>

int main(void){
  printf("Masukkan Bilangan Ganjil\n");

  int x,y,k,i,j;

  printf("Input Bilangan Awal : ");
  scanf("%d",&x);
  printf("Input Bilangan akhir  : ");
  scanf("%d",&y);
    
  printf("\n");
    k = x + y;
    for (i = 0; i < 1; i++)
      {
        for (j = 0; j < 1; j++)
        {
            if( x %2 == 1 ){
                
                if( y %2 == 1 ){
                    printf("Hasil Penjumlahan Bilanga Ganjil : %d",k);
                }else{
                    printf("%d Angka yang dimasukkan Bukan Bilangan Ganjil",y);
                }
            }
            else if(x %2 == 1){
                    printf("%d Angka yang dimasukkan Bukan Bilangan Ganjil",x);
            }else if( x %2 == 0 ){
                    printf("%d dan %d Angka yang dimasukkan Bukan Bilangan Ganjil",x,y);
            }
            
        }
        printf("\n");
    }
    return 0;
}