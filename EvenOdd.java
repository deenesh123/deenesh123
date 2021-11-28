import java.util.*;
public class EvenOdd {
	
	public static void main(String args[]){
	int num; Scanner sc=new Scanner(System.in);
	System.out.print("Enter any Integer Number :: ");
	num=sc.nextInt();
	if(num%2 == 0)
	System.out.println(num + " is EVEN Number");
	else
	System.out.println(num + " is ODD Number");
	}
}
