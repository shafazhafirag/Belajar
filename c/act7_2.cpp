#include <stdio.h>
#include <conio.h>

int main (){
    int baris,kolom;
    printf("Masukkan Jumlah Baris : ");
    scanf("%d",&baris);
    printf("Masukkan Jumlah Kolom : ");
    scanf("%d",&kolom);
    printf("\n");

    int matrix[baris][kolom];

    printf("input element array : \n");
    for (int i=0;i<baris;i++){
        for(int j=0;j<kolom;j++){
            printf("Matrix [%d][%d] : ",i+1,j+1);
            scanf("%d",&matrix[i][j]);
        }
        printf("\n");
    }
    printf("Isi Array : \n");
    for (int i=0;i<baris;i++){
        for(int j=0;j<kolom;j++){
            printf(" %d ",matrix[i][j]);
        }
        printf("\n");
    }
    getch();
    return 0;
}    