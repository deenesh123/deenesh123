import java.util.*;
public class Selectionsort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("Enter elements of array : ");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Unsorted array : ");
		for(int i=0;i<10;i++)
		{
            System.out.print(arr[i]+" ");
		}
		System.out.println();
        for(int i=0;i<9;i++)
        {
            int min = i;
            for (int j=i+1;j<10;j++)
			{
                if(arr[j] < arr[min])
                    min = j;
			}
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
		}
        System.out.print("Sorted array : ");
        for(int i=0;i<10;i++)
		{
            System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
