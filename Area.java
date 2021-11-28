import java.util.*;
public class Area {
   public static void main(String args[])
   {
	   double l,b,h,volume,area;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Length::");
	   l=sc.nextDouble();
	   System.out.print("Enter Breadth::");
	   b=sc.nextDouble();
	   System.out.print("Enter Height::");
	   h=sc.nextDouble();
	   area=2*((l*b)+(b*h)+(l*h));
	   volume=l*b*h;
	   System.out.println("Area = "+area);
	   System.out.println("Volume = "+volume);
   }
}
