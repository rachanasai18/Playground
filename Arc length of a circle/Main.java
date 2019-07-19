#include<stdio.h>
int main()
{
  float radius,angle;
  scanf("%f %f",&radius,&angle);
  float arc_length = ((2 * 3.14 * radius) * (angle/360));
  printf("%.2f",arc_length);
  return 0;
}