import java.util.*;
public class LeapYear {
	 public static void main(String args[])
	{ 
    Scanner sc=new Scanner(System.in);
	int y;
	System.out.print("Enter a year :: ");
	y=sc.nextInt();
	if(y%100 != 0 && y%4==0 )
	System.out.println(y+ " is LEAP Year");
	else
	System.out.println(y + " is Not Leap Year");
	}
}
