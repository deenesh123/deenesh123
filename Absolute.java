import java.util.*;
public class Absolute {
  public static void main(String args[])
  {
	  int num;
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter a Number::");
	  num=sc.nextInt();
	  if(num<0)
		  num=-num;
	      System.out.println("Avsolute Value Of Number::"+num);
  }
}
