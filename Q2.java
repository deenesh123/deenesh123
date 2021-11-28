abstract class figure
{
	protected double area;
	abstract double find_area();
}

class circle extends figure
{
	double radius;
	circle(double radius)
	{
		this.radius=radius;
	}
	public double find_area()
	{
		return Math.PI*radius*radius;
	}
}

class square extends figure
{
	double side;
	square(double side)
	{
		this.side=side;
	}
	public double find_area()
	{
		return side*side;
	}
}

public class Q2
{
	public static void main(String args[])
	{
		circle c=new circle(50);
		System.out.print("Area of Square= "+c.find_area());
		square s=new square(60);
		System.out.print("\nArea of Circle= "+s.find_area());
	}
}
