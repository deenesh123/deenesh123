import java.util.*;
public class Pattern
{ 
	public static void main(String args[ ])
    {
      Scanner sc=new Scanner(System.in);
      int n, i, j, k;
      System.out.print("Enter Num of Rows :: "); n=sc.nextInt();
      for(i=1; i<=n; i++) 
      { 
    	  for(j=1;j<=n-i; j++)
             System.out.print("  "); 
          for(k=1;k<=i; k++)
             System.out.print("* "); 
          System.out.println();
      }
    }
}