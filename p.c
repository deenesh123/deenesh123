#include <stdio.h>  
int main() 
{  
  int i,j,k;
  int n;  
  printf("Enter the number of rows\n");  
  scanf("%d",&n);  
  int p=n-1;  
  int s=1;  
  for(i=1;i<=n;i++)  
  {  
    for(j=1;j<=p;j++)  
    {  
      printf(" ");  
    }  
    for(k=1;k<=s;k++)  
    {  
      printf("*");  
    }  
    if(p>i)  
    {  
      p=p-1;  
      s=s+2;  
    }  
    if(p<i)  
    {  
      p=p+1;  
      s=s-2;  
    }  
    printf("\n");  
  }  
  return 0;}  
