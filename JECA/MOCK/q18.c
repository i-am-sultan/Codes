    #include <stdio.h>
    union temp
    {
        char a;
        char b;
        int c;
    }t;
    int main()
    {
        printf("%d", sizeof(t));
        return 0;
    }