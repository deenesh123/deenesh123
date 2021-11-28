import java.util.*;
public class PrintTable {
	
    public static void main(String args[ ])
	{ 
    Scanner sc=new Scanner(System.in); int num,i;
	System.out.print("Enter a number :: ");
	num=sc.nextInt();
	for(i=1;i<=20;i++)
	System.out.println(num + " X " + i + " = " + num*i);
	}
}
