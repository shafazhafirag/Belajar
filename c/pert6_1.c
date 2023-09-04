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
            if( x %2 == 1 ){
                
                if( y %2 == 1 ){
                    printf("Hasil Penjumlahan Bilanga Ganjil : %d",k);
                }else {
                    printf("%d Angka yang dimasukkan Bukan Bilangan Ganjil",y);
                
                }
            }else if( y %2 == 0 ){
                printf("%d dan %d Angka yang dimasukkan Bukan Bilangan Ganjil",x,y);
            }else
            printf("%d  Angka yang dimasukkan Bukan Bilangan Ganjil",x);
            
        
        printf("\n");
    
    return 0;
}