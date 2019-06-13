#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  switch(num)
  {
    case 1:
      printf("ONE");
      break;
    case 2:
      printf("TWO");
      break;
       case 3:
      printf("Three");
      break;
    case 4:
      printf("FOUR");
      break;
       case 5:
      printf("FIVE");
      break;
    default:
      printf("Invalid");
  }
  return 0;
}