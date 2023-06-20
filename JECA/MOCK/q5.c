#include <stdio.h>
int main()
{
    int i = 5;
    do
    {
        putchar(i + 100); 
        printf ("%d",i--);
    }
    while(i);
    return 0;
}