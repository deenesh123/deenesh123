import java.util.*;
class centigrade
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double c,f;
		System.out.print("Enter temperature in centigrade : ");
		c=sc.nextDouble();
		f=(c*1.8)+32;
		System.out.println(c+" in fahrenheit = "+f);
	}
}
