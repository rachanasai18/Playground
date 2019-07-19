#include<stdio.h>
int main()
{
	//your code here
  long int n,c,fact = 1;
  scanf("%ld",&n);
  for(c=1;c<=n;c++)
  {
    fact = fact * c;
  }
  printf("%ld",fact);
  return 0;
}