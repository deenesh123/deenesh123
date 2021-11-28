import java.util.*; import static java.lang.Math.*;
public class Roots {
	public static void main(String args[ ])
	{
	int a, b, c;double d, r1, r2;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the coefficients a, b and c of a quadratic equation: :: ");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=b*b-4*a*c;
	if(d >= 0)
	{
	r1 = (-b+sqrt(d)) / (2*a); r2=(-b-sqrt(d)) / (2*a);
	System.out.println("Roots of the quadratic equation are :"
	+r1+" and "+ r2);
	}
	else
	System.out.println("Roots are Imaginary.");
	}
}

