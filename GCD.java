import java.util.Scanner;
public class GCD {
	    public static void main(String arg[])
		{ 
	       int x,y,min, gcd;
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Enter two numbers :: ");
		   x=sc.nextInt(); y=sc.nextInt();
		   min = x<y? x : y;
		   while(true)
		   {
		     if(x % min == 0 && y % min == 0)
		     {
		       gcd=min; break;
		     }
		     min--;
		   }
		   System.out.println("GCD = "+ gcd);
		}
}

