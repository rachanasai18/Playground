#include<stdio.h>
int main()
{
  //Type your code here
  float hyp,adj,opp;
  scanf("%f%f",&opp,&adj);
  hyp = sqrt((opp *opp) + (adj * adj));
  printf("%.2f",hyp);
  return 0;
}