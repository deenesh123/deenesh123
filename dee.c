#include <stdio.h>
 
int main() 
{
  int n,i,j;
  printf("Please Enter the Number of Rows:");
  scanf("%d",&n);
  for(i=1;i<=n;i++) 
  {
      for(j=1;j<=n;j++) 
      {
      	if(j<=n-i)
      	{
          printf(" ");
	}
	else
	{
	  printf("*");		  	
	}         
      }
      printf("\n");
  }
  return 0;
}
