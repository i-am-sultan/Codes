#include <stdio.h>
int main()
{
    printf("Today is: %s",__DATE__);
    printf("\n");
    printf("Now it is: %s",__TIME__);
    printf("\n");
    printf("The file name is: %s",__FILE__);
    printf("\n");
    printf("We are in line no: %d",__LINE__);
    return 0;
}