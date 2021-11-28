#include<stdio.h>
#define MAX 10
int main()
{
  int arr[MAX],i,j,temp;
  printf("Before Sorting\n");
  for(i=0;i<MAX;i++)
    scanf("%d",&arr[i]);
  for(i=0;i<MAX;i++)
    for(j=0;j<MAX-i;j++)
      if(arr[j]>arr[j+1])
      {
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
  printf("After Sorting\n");
  for(i=0;i<MAX;i++)
    printf("%d\n",arr[i]);
  return 0;
}
  
