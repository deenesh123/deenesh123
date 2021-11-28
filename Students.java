import java.util.*;
import java.lang.*;

class Student
{
    int rollno;
    String fname,lname;
    String branch;

    void getdata1(int rollno,String fname,String lname,String branch)
    {
        this.rollno = rollno;
        this.fname = fname;
        this.lname = lname;
        this.branch = branch;
    }

    void show()
    {

        System.out.println("Roll no: "+rollno);
        System.out.println("first name: "+fname);
        System.out.println("last name: "+lname);
        System.out.println("branch: "+branch);
    }
}


class GradStudent extends Student
{
    String specialization;
    void getdata2(int rollno,String fname,String lname,String branch,String specialization)
    {
      this.rollno = rollno;
      this.fname = fname;
      this.lname = lname;
      this.branch = branch;
      this.specialization = specialization;
    }

    void show()
    {

        System.out.println("Roll no: "+rollno);
        System.out.println("first name: "+fname);
        System.out.println("last name: "+lname);
        System.out.println("branch: "+branch);
        System.out.println("specialization : "+specialization);
    }
}


class UGStudent extends Student
{
   String Elective;

   void getdata3(int rollno,String fname,String lname,String branch,String Elective)
   {
     this.rollno = rollno;
     this.fname = fname;
     this.lname = lname;
     this.branch = branch;
       this.Elective = Elective;
   }

   void show()
   {
     System.out.println("Roll no: "+rollno);
     System.out.println("first name: "+fname);
     System.out.println("last name: "+lname);
     System.out.println("branch: "+branch);
     System.out.println("elective  : "+Elective);

   }

}


public class Students
{
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int rollno;
      String fname,lname;
      String branch;

      System.out.println("Enter the rollno: ");
      rollno = sc.nextInt();
      System.out.println("Enter the fname: ");
      fname = sc.next();
      System.out.println("Enter the lname: ");
      lname = sc.next();
      System.out.println("Enter the branch: ");
      branch = sc.next();

       String Elective;
       System.out.println("Enter the Elective: ");
       Elective = sc.next();

      UGStudent s = new UGStudent();
     s.getdata3(rollno,fname,lname,branch,Elective);
      s.show();
   }
}
