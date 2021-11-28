public class Primenumber
{
	public static void main(String args[])
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int i, j, b=1;
		System.out.println("Prime numbers between "+x+" and "+y+" are : ");
		for(i=x; i<=y; i++)
 {
 a = 1;
If(x==1)
 a=0;
 for(j=2; j<=i/2; j++)
 {
 if (i % j == 0)
 {
 a = 0;
 break;
 }
 }
 if(a == 1)
 System.out.print(i + " ");
 } 
	}
}
