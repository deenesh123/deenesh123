import java.util.*;
public class Grade {
	
	public static void main(String arg[]) {
	double p;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your Percentage of Marks :: "); p=sc.nextDouble();
	if(p >= 80)
		System.out.println("Grade O");
	else if(p >= 70)
		System.out.println("Grade A");
	else if(p >= 60)
		System.out.println("Grade B");
	else if(p >= 50)
		System.out.println("Grade C");
	else if(p >= 40)
		System.out.println("Grade D");
	else
		System.out.println("Fail");
	}
}
