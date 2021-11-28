import java.util.*;
class Faculty
{
	int empid; String name; int age; double salary;
	void setdata(int id, String n, int a, double s)
	{
		empid=id; name=n; salary=s;
		age=a;
	}
	void print()
	{
		System.out.print("EmpId:: "+empid+"\tName: "+name+"\tAge: "+age+"\tSalary: "+salary);
	}
	public static void main(String arg[ ]) 
	{
		int i, j; int a, id; String n; double s;
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter how many Faculty details you want to show:: ");
		j=sc.nextInt();
		Faculty f[]=new Faculty[j];
		for(i=0; i<j; i++)
		{
			f[i]=new Faculty();
			System.out.println("Enter the "+ (i+1) +" Faculty details :: ");
			System.out.print("\nEnter EmpId:: "); id=sc.nextInt();
			System.out.print("Enter Name:: "); n=sc.next();
			System.out.print("Enter Age:: "); a=sc.nextInt();
			System.out.print("Enter Salary:: "); s=sc.nextDouble();
			f[i].setdata(id, n, a, s);
		}
		for(i=0; i<j; i++)
		{
			System.out.println("\nFaculty " + (i+1) + " Details:: ");
			f[i].print();
		}
	}
}
