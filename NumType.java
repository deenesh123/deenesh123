import java.util.*;
public class NumType {
   public static void main(String args[])
   {
	   int num;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter a Number::");
	   num=sc.nextInt();
	   if(num>0)
		   System.out.println(num+" Is a +ve Number");
	   if(num<0)
		   System.out.println(num+" Is a -ve Number");
	   if(num==0)
		   System.out.println(num+" Is ZERO");
   }
}
