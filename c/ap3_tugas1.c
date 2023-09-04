#include <stdio.h>
#include <stdlib.h>
/* nomor 1*/
int main()
{
    int a, b;
    printf("Enter two integers, and i will tell you\n");
    printf("the relationships they satifsy : ");
    scanf("%d %d",& a, &b);

    if(a != b)
        printf("%d is not equal to %d\n", a, b);

    if(a < b)
        printf("%d is less than  %d\n",a, b);

    if(a <= b)
        printf("%d is greater than or equall %d\n",a, b);

    return 0;
}
