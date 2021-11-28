import java.util.*;
import java.lang.Math;

class Armstrong
{
	static boolean armstrong(int n)
	{
		int d = digit(n);
		int sum = 0, m=n, di;
		while(m!=0)
		{
		  di=m%10;
	  	  sum = sum + (int)Math.pow(di, d);
		  m=m/10;
		}
		if(sum==n)
	 	   return true;
		else
		   return false;
	}
	
	static int digit(int n)
	{
		int a=0;
		while(n!=0)
		{
		  a++;
		  n=n/10;
		}
		return a;
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
                System.out.println("NAME= Deenesh Kumar Sabat \nROLL NO=201940363 \nSET=ODD\n");
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		boolean result = armstrong(n);
		if(result == true)
		    System.out.println(n+" is an Armstrong number.");
		else
		    System.out.println(n+" is not an Armstrong number.");
	}
}
