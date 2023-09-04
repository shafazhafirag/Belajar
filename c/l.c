#include <stdio.h>
#define PHI 3.14
int main()
{
    /////  deklarasi variable jari-jari dan keliling
    float r, K; 
    
    printf("Masukan nilai jari-jari: ");
    scanf("%f", &r); // input jari-jari
    
    /// RUMUS KELILING LINGKARAN
    /// K = 2.phi.r
    K = 2*PHI*r;
    printf("\nHasil perhitungan keliling lingkaran : %.2f", K);
    
  return 0;
}