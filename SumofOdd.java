import java.util.*;
public class SumofOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum=0;
		System.out.print("Enter elements of array : ");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Square root of each number of array : ");
		for(int i=0;i<10;i++)
		{
            System.out.print((arr[i]*arr[i])+" ");
			if(arr[i]%2!=0)
				sum+=arr[i];
		}
		System.out.println();
		System.out.println("Sum of odd numbers present in the array : "+sum);
	}
}
