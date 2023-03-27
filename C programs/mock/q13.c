#include <stdio.h>
int main()
{
    int y = 2;
    int z = y + (y = 10);
    printf("%d\n", z);
    return 0;
}