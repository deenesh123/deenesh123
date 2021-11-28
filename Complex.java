import java.util.*;
class Complex
{
	double real, img;
	public Complex(double r, double i)
	{
		real=r;
		img=i;
	}
	void add(Complex c1, Complex c2)
	{
		real=c1.real+c1.real;
		img=c2.img+c2.img;
		System.out.println("Sum of two complex number ");
		System.out.print("Real= "+real+" and Img= "+img);
	}
}
public class C
{
	public static void main(String args[])
	{
		Complex c1=new Complex(4.5,2);
		Complex c2=new Complex(3.4,1.2);
		c1.add(c1, c2);
	}
}
