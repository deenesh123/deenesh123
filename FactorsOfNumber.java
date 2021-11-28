import java.util.*;
public class FactorsOfNumber {
    public static void main(String args[ ])
    {
    Scanner sc=new Scanner(System.in);
    int i, n;
	System.out.print("Enter the number to find the factor :: ");
	n=sc.nextInt();
	System.out.print("The factors of the number " + n + " are :: ");
	for(i=1; i<=n; i++)
	if(n%i==0)
	System.out.print(i + " ");
	}
}
