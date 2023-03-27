#include <stdio.h>
int main()
{
    char var = 'a';
    char *p = &var;

    
    printf("The value of var is: %d\n",var); //97
    printf("The value of p is: %d\n",p); //6487575
    printf("The value of p+1 is: %d\n",p+1); //6487576
    printf("The value of p-1 is: %d\n",p-1); //6487574
    printf("The value of ++p is: %d\n",++p); //6487576
    printf("The value of --p is: %d\n",--p); //6487575

    return 0;
}