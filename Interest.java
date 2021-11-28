import java.util.*;
class Interest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double p,r,t,si,ci;
		System.out.print("Enter Principal : ");
		p=sc.nextDouble();
		System.out.print("Enter Rate : ");
		r=sc.nextDouble();
		System.out.print("Enter Time(in year) : ");
		t=sc.nextDouble();
		si=(p*r*t)/100;
		ci=p*Math.pow((1+(r/100)),t);
		System.out.println("Simple Interest = "+si);
		System.out.println("Compound Interest = "+ci);
	}
}
