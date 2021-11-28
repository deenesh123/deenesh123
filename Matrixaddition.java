import java.util.*;
class Matrixaddition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < r; i++)
		{
            for (int j = 0; j < c; j++)
			{
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matrix : ");
        for (int i = 0; i < r; i++)
		{
            for (int j = 0; j < c; j++)
			{
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < r; i++)
		{
            int rSum = 0;
            for (int j = 0; j < c; j++)
			{
                rSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rSum);
        }
        for (int i = 0; i < c; i++)
		{
            int cSum = 0;
            for (int j = 0; j < r; j++)
			{
                cSum += arr[j][i];
            }
            System.out.println("Column " + (i + 1) + " sum = " + cSum);
        }
	}
}
