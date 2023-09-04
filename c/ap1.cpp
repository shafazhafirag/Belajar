include <iostream>

using namespace std;

int main()
{
   printf("## Program Bahasa C Persegi Panjang Bintang ## \n");
  printf("============================================== \n\n");

  int tinggi_persegi,lebar_persegi,i,j;

  printf("Input tinggi persegi: ");
  scanf("%d",&tinggi_persegi);
  printf("Input lebar persegi: ");
  scanf("%d",&lebar_persegi);

  printf("\n");

  for(i=1; i<=tinggi_persegi; i++) {
    for(j=1; j<=lebar_persegi; j++) {
      printf(" *");
    }
    printf("\n");
  }
}
