#include <stdio.h>


int main (){
    int el,ni,i, array[i];
    printf("Masukkan jumlah elemen yang akan disimpan dalam array : ");
    scanf("%d",&el);

    for(i=0; i<el; i++){
    printf ("Nilai Ke-%d : ", i );
    scanf("%d",&array[i]);
    }

    printf("nilai elemen genap : ");
    for(i=2;i<el;i++){
        if(array[i]%2!= 0){
        printf("%d \n");
        }
    }
    printf("nilai elemen ganjil: ");
    for(i=0;i<el;i++){
        if(array[i]%2==0){
        printf("%d \n");
        }
    }
}
