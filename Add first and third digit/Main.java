#include<stdio.h>
int main()
{
  int num, First, Third, Sum;
  scanf("%d", &Sum);
  First = Sum /100;
  Third = Sum  %10;
  Sum = First + Third;
  printf("%d",Sum);
}