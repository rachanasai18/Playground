#include<stdio.h>
int main()
{
  int number;
  scanf("%d",&number);
  int val = number % 100;
  val = val/10;
  printf("%d",val);
  return 0;
}