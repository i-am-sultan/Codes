#include <stdio.h>
int main()
{
  int a = 10;
  int b = 20;
  int c = (a >> 2) + (b << 2);
  printf("%d\n", c);
  return 0;
}