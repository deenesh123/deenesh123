import java.util.*;
public class Greatest {
	public static void main(String arg[]) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		a=sc.nextInt();
		System.out.println("Enter the Second Number:");
		b=sc.nextInt();
		System.out.println("Enter the Third Number:");
		c=sc.nextInt();
		if (a > b)
		{
		if (a > c)
		System.out.println("The Greatest no is "+a);
		else
		System.out.println("The Greatest no is "+c);
		}
		else { if (b > c)
		System.out.println("The Greatest no is "+b);
		else
		System.out.println("The Greatest no is "+c);
		}
	}

}
