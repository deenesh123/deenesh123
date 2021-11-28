import java.util.Scanner;

public class Gratest {
	
	public static void main(String arg[]) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any three Integer Numbers :: ");
		a=sc.nextInt();
		b=sc.nextInt();
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
