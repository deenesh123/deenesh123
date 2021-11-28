import java.util.Scanner;
public class Rows {

	public static void main(String[] args) {
		int i,j,k;
		  int n; 
		  Scanner sc=new Scanner (System. in);
		  System.out.println("Enter the number of rows\n"); 
		  n=sc.nextInt();
		  int p=n-1;  
		  int s=1;  
		  for(i=1;i<=n;i++)  
		  {  
		    for(j=1;j<=p;j++)  
		    {  
		       System.out.println(" ");  
		    }  
		    for(k=1;k<=s;k++)  
		    {  
		       System.out.println("*");  
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
		    System.out.println("\n");   
		   }
	}

}
