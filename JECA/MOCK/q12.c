 #include <stdio.h>
    int main()
    {
        int one = 1, two = 2;
        #ifdef next
        one = 2;
        two = 1;
        #endif
        printf("%d, %d", one, two);
    }