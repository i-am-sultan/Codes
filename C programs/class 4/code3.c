#include <stdio.h>
int main()
{
    int arr[10];
    arr[1]=12;
    int* ptr = arr;
    
    printf("ptr = %x\n",ptr); 
    printf("arr = %x\n",arr);
    printf("arr[0] = %x\n",&arr[0]);
    printf("arr[1] = %x\n",&arr[1]); 
    printf("arr+1 = %x\n",arr+1);
    printf("arr+1 = %d\n",arr[1]);
    printf("*(arr+1) = %d",*(arr+1));

    return 0;
}