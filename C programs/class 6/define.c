#include <stdio.h>
#define PI 3.14
#define square(x) x*x
int main()
{
    int r=7;
    printf("The area of the circle is: %lf", PI*square(r));
    return 0;
}