import java.util.*;
public class Calculator
{ 
	public static void main(String args[ ])
    {
      int n1, n2; String op; 
      Scanner key = new Scanner(System.in);
      System.out.print("Enter First Number :: "); n1=key.nextInt();
      System.out.print("Enter Second Number :: "); n2=key.nextInt();
      System.out.print("Enter the Operator :: "); op=key.next();
      if(op.equals("+"))
           System.out.println("Sum of Two Numbers is " + (n1+n2));
      else if(op.equals("-"))
           System.out.println("Difference of Two Numbers is " + (n1-n2));
      else if(op.equals("*"))
           System.out.println("Multiplication of Two Numbers is " + (n1*n2));
      if(op.equals("/"))
           System.out.println("Division of Two Numbers is " + (n1/n2));
      else System.out.println("Wrong Operator");
    }
}