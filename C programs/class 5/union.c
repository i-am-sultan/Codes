#include <stdio.h>
#include <string.h>

struct student
{
    char name[20];
    int roll;
    float marks;
}Ab;

int main()
{
    strcpy(Ab.name,"Abhisekh Sharma");
    Ab.roll=21;
    Ab.marks=89.2;

    printf("The name is %s\n",Ab.name);
    printf("The roll is %d\n",Ab.roll);
    printf("The marks is %f\n",Ab.marks);

    printf("The size of Ab is %d",sizeof(Ab));

    return 0;
}