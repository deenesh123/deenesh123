import java.util.*;
public class IfTest {
	
	public static void main(String args[]){
	double marks;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your Marks Percentage ");
	marks=sc.nextDouble();
	if(marks >= 90)
	{
	System.out.println("You got the Grade: Excellent ");
	System.out.println();
	System.out.println("You are eligible for Scholarship.");
	}
	}
}
