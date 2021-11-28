import java.util.*;
class explicit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a=5.5;
		int b=4;
		int sum = (int)a+b;
		System.out.println("Explicit type casting");
		System.out.println((int)a+"+"+b+"="+sum);
		
		System.out.println("Implicit type casting");
		int x=12;
		System.out.println("Int value : "+x); 
		double y=x;
		System.out.println("Double value : "+y); 
	}
}
