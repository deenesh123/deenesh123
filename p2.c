#include<stdio.h> 

int main()
{ 
    int n;
    int space = n - 1; 
    printf("Enter the number of rows:");
    scanf("%d",&n);
    for (int i = 0; i < n; i++) 
    { 

        for (int j = 0;j < space; j++) 
            printf(" "); 

        for (int j = 0;j <= i; j++) 
            printf("* "); 
  
        printf("\n"); 
        space--; 
    } 
 
    space = 0; 
 
    for (int i = n; i > 0; i--) 
    { 
 
        for (int j = 0; j < space; j++) 
            printf(" "); 
 
        for (int j = 0;j < i;j++) 
            printf("* "); 
  
        printf("\n"); 
        space++; 
    }
    return 0; 
}
