#include<stdio.h>

void swap(int*,int*);
int main()
{
  int a,b;
  printf("Enter two numbers\n");
  scanf("%d\n %d",&a,&b);
  swap(&a,&b);
  printf("a=%d b=%d",a,b);
}
void swap(int *x,int *y)
{
  int t;
  t=*x;
  *x=*y;
  *y=t;
}
