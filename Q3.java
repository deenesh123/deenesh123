import java.util.*;

interface subsum
{
	public int sub();
	public int sum();
}
interface multdiv extends subsum
{
	public int mul();
	public int div();
}
class Arithmatic implements multdiv
{
	int a,b;
	Arithmatic(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int mod()
	{
		return a%b;
	}
	
	public int sub()
	{
		if(a>=b)
			return a-b;
		
		return b-a;
	}
	public int sum()
	{
		return a+b;
	}
	public int mul()
	{
		return a*b;
	}
	public int div()
	{
		if(a>=b)
		  return a/b;
	    
		return b/a;
	}
}

public class Q3 
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    Arithmatic a=new Arithmatic(50,100);
    System.out.println("The sum of two numbers is: "+a.sum());
    System.out.println("The difference of two numbers is: "+a.sub());
    System.out.println("The product of two numbers is: "+a.mul());
    System.out.println("The quotient is: "+a.div());

  }
}
