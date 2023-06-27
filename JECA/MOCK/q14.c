   #include <stdio.h>
    struct
    {
        int k;
        char c;
    } p;
    int p = 10;
    int main()
    {
        p.k = 10;
        printf("%d %d\n", p.k, p);
    }