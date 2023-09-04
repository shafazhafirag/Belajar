#include <stdio.h>
#include <stdlib.h>
/*nomer 1C/3*/
int main()
{
    int a, b;
    printf("Enter two integers, and i will tell you\n");
    printf("the relationships they satifsy : ");
    scanf("%d %d",& a, &b);

    if(a == b)
        printf("%d is equal to %d\n", a, b);

    if(a <= b)
        printf("%d is less than or equal to %d\n",a, b);

    if(a >= b)
        printf("%d is greater than or equal to %d\n",a, b);

    return 0;
}
