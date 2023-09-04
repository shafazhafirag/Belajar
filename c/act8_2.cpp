#include <stdio.h>

int tambah(int bil1,int bil2){
    return bil1+bil2;
}
int kurang(int bil1,int bil2){
    return bil1-bil2;
}

int main(){
    int a=10;
    int b=5;
    int hasilTambah=tambah(a,b);
    int hasilKurang=kurang(a,b);
    printf("Angka %d dan %d memiliki hasil tambah %d dan hasil kurang %d",a,b,hasilTambah,hasilKurang);    
}