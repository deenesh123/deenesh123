import java.util.*;
class Student
{
	int roll;
	String name; 
	float marks[];
	Student(int r, String n, float m[]) 
	{
		marks = new float[m.length]; roll=r; name=n;
		for(int i=0; i<m.length; i++)
			marks[i]=m[i];
	}
	void print()
	{
		System.out.print("Rollno: "+roll+"\tName: "+name+"\tMarks: ");
		for(int i=0; i<5; i++)
			System.out.print(marks[i] + " ");
	}
	public static void main(String arg[ ]) 
	{
		int i, j; int r; String n;
		float mark[] = new float[5];
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter how many student details you want to show:: ");
		j=sc.nextInt();
		Student st[]=new Student[j];
		for(i=0; i<j; i++)
		{
			System.out.println("Enter the "+ i +"studnet details :: ");
			System.out.print("\nEnter Roll "); r=sc.nextInt();
			System.out.print("Enter Name "); n=sc.next();
			System.out.print("Enter 5 subjects Makrs ");
			for(int x=0; x<5; x++)
				mark[x]=sc.nextFloat();
			st[i]=new Student(r, n, mark);
		}
		for(i=0; i<j; i++)
		{
			System.out.println("\nResult of Student" + (i+1));
			st[i].print();
		}
	}
}
