#include <stdio.h>
#define PHI 3.14
int LuasLingkaran (float r){
  return  PHI*r*r;
}
int KelilingLingkaran (float r){
  return 2*PHI*r;
}
int main(){
    float luas,keliling, r;
    luas = LuasLingkaran(r);
    keliling = KelilingLingkaran(r);
    printf(" Menghitung Luas & Keliling Lingkaran\n");
    printf("===========================================\n");
    printf("Masukkan Jari Jari : ");
    scanf("%f",&r);
    printf("===========================================\n");
    printf("Luas Lingkarna adalah %2.f \n", luas);
    printf("Keliling Lingkaran adalah %2.f", keliling);
    return 0;
}