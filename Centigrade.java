import java.util.*;
public class Centigrade {
  public static void main(String args[])
  {
	  double c,f;
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter Temperature in Centigrade::");
	  c=sc.nextDouble();
	  f=(c*1.8)+32;
	  System.out.println(c+" in Fahrenheit = "+f);
  }
}
