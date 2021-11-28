import java.util.*;
public class Prime_Composite {
    public static void main(String args[ ])
	{
       Scanner sc=new Scanner(System.in); 
       int n, i; 
       boolean isPrime; 
       char ch='y';
	   do
	   { 
		  isPrime=true; 
		  System.out.print("Enter a number :: "); 
		  n=sc.nextInt();
	      for(i=2; i<n/2; i++)
	        if(n%i==0) { isPrime=false; break; }
	      if(isPrime) 
	    	  System.out.println("The number " + n + " is a PRIME");
	      else 
	    	  System.out.println("The number " + n + " is a Composite");
	      System.out.print("\nAre you Want to Check Another Number (y/Y) :: ");
	      ch=sc.next().charAt(0);
	   }while(ch=='y' || ch=='Y');
    }
}