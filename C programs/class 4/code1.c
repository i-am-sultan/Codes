#include <stdio.h>
int main()
{
    int a=11;
    int *p; 
    p=&a;

    printf("%d\n",a); //11
    printf("%d\n",&a); //
    printf("%d\n",p); //
    printf("%d\n",&p);
    printf("%d\n",*p);

    return 0;
}