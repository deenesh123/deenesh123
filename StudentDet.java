import java.util.*;

class Student
{
	protected int stud_roll;
	protected String stud_name;
	protected String stud_branch;
	
	Student(int roll, String name, String branch)
	{
		stud_roll=roll;
		stud_name=name;
		stud_branch=branch;
	}
	void display()
	{
		System.out.print("\nROLL="+stud_roll+" NAME="+stud_name+" BRANCH="+stud_branch);
	}
}

public class StudentDet
{
	public static void main(String args[])
	{
		int i, n, r;
		String nam, br;
		Scanner sc= new Scanner(System.in); 
		System.out.println("NAME= Deenesh Kumar Sabat \nROLL NO=201940363 \nSET=ODD\n");
		System.out.println("Enter Number of Student : ");
		n=sc.nextInt();
		Student std[]=new Student[n];
		for(i=0; i<n; i++)
		{
			System.out.print("\nEnter Roll:: "); r=sc.nextInt();
			System.out.print("Enter Name:: "); nam=sc.next();
			System.out.print("Enter Branch:: "); br=sc.next();
			std[i]=new Student(r, nam, br);
		}	
		for(i=0; i<n; i++)
		{
			std[i].display();
		}
	}
}
