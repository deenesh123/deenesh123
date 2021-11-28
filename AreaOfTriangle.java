import java.util.Scanner;
public class AreaOfTriangle {
   private static Scanner sc;
   
   public static void main(String[] args)
   {
	   double a,b,c,Perimeter,s,Area;
	   sc=new Scanner(System.in);
	   
	   System.out.println("\n Please Enter Three Sides Of Triangle:");
	   a=sc.nextDouble();
	   b=sc.nextDouble();
	   c=sc.nextDouble();
	   Perimeter=a+b+c;
	   s=(a+b+c)/2;
	   Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	   System.out.format("\n The Area Of Triangle = %.2f\n",Area); 
   }
}
