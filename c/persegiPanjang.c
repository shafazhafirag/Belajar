#include <stdio.h>
int LuasPersegiPanjang (int p, int l){
  return p*l;
}
int KelilingPersegiPanjang (int p, int l){
  return 2*(p+l);
}
int main(){
    int luas,keliling, p, l;
    luas = LuasPersegiPanjang(p, l);
    keliling = KelilingPersegiPanjang(p, l);
    printf(" Menghitung Luas & Keliling Persegi Panjang\n");
    printf("===========================================\n");
    printf("Masukkan panjang : ");
    scanf("%d",&p);
    printf("Masukkan lebar : ");
    scanf("%d",&l);
    printf("===========================================\n");
    printf("Luas persegi panjang adalah %d \n", luas);
    printf("Keliling persegi panjang adalah %d", keliling);
    return 0;
}