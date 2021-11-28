import java.util.*;
public class MaxOfFive {

	public static void main(String args[]){
	int a,b,c,d,e,max;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any FIVE Integer Numbers :: ");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	e=sc.nextInt(); max=a;
	if(b>max) max=b;
	if(c>max) max=c;
	if(d>max) max=d;
	if(e>max) max=e;
	System.out.println("Maximum of Five Numbers = "+max);
	}
}