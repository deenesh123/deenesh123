#include<stdio.h>
int main()
{
 int num=20;
 int *p;
 p=&num;
 printf("Address of num is %p",&num);
 printf("\nAddress of num is %p",p);
 printf("\nvalue of num is %d",num);
 printf("\nvalue of num is %d",*p);
 printf("\nvalue of num is %d",*(&num));
 printf("\nValue of pointer p is %p",p);
 printf("\nAddress of pointer p is %p",&p);
}
