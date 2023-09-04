#include <stdio.h>
#include <conio.h>
void main()
{       
    int a,b,c,sum, pro, avg, lar, sm;
	printf("Input three different integers : ");
	scanf("%d%d%d", &a, &b, &c);
	sum = a+b+c;
	pro = a*b*c;
    //untuk terbesar
    if(a>b)
    {
        if(b>c)
            lar = a;
        else
        {
            if(a>c)
                lar = a;
            else
                lar = c;
        }
    }
    else
    {
        if(b>c)
            lar = b;
        else
            lar = c;
    }
    //untuk terkecil
    if(a<b)
    {
        if(b<c)
            sm = a;
        else
        {
            if(a<c)
                sm = a;
            else
                sm = c;
        }
    }
    else
    {
        if(b<c)
            sm = b;
        else
            sm = c;
    }
	
	avg=sum/3;
	printf("Sum is %d\n", sum);
	printf("Average is %d\n",avg);
    printf("Product is %d\n", pro);
    printf("Smallest is %d\n", sm);
    printf("Largest is %d\n", lar);
    
}