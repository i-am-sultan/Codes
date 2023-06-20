#include <stdio.h>
void function(int *y, int *x)
{
    y = x;
    *x = 2020;
    printf("%d %d",*x,*y);
}
int main()
{
    int a = 2010, b = 2011;
    function(&a, &b);
    printf("%d %d", a, b);
    return 0;
}
