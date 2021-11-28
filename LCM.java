import java.util.*;
public class LCM {
    public static void main(String arg[])
	{ 
       int x,y,max, lcm;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter two numbers :: ");
	   x=sc.nextInt(); y=sc.nextInt();
	   max = x>y? x : y;
	   while(true)
	   {
	     if(max % x == 0 && max % y == 0)
	     {
	       lcm=max; break;
	     }
	     ++max;
	   }
	   System.out.println("LCM = "+ lcm);
	}
}
