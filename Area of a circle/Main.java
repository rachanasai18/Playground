#include<stdio.h>
int main()
{
  //Type your code here
  int dia;
  scanf("%d",&dia);
  float area,r;
  r = (float)dia/2;
  area = 3.14 * r * r;
  printf("%0.2f",area);
  return 0;
}