#include <stdio.h>
int main()
{
    int i = 10;
    void *p = &i;
    printf("%d\n", p);
    printf("%d\n", *p); //it's return type is void can't return the int value.
    // printf("%d\n", (int)*p);
    return 0;
}