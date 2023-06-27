#include <stdio.h>

void foo(int *p);  // Function prototype for foo()

int main()
{
    int i = 97, *p = &i;
    foo(&i);
    printf("%d ", *p);
    return 0;
}

void foo(int *p)
{
    int j = 2;
    p = &j;
    printf("%d ", *p);
}
