   #include <stdio.h>
    int main()
    {
        char *p = NULL;
        char *q = 0;
        printf("%d",p);
        printf("%d",q);
        if (p)
            printf(" p ");
        else
            printf("nullp");
            printf("nullp");
        if (q)
            printf("q\n");
        else
            printf(" nullq\n");
    }