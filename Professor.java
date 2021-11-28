class College
{
  protected String name, city;
  void display( ) {
    System.out.println("College Name is : "+name);
    System.out.println("Located at : " + city);
  }
  void setdata(String str1, String str2) {
    name=str1; city=str2;
  }
}
class Department extends College 
{
  protected String deptname;
  void setdata(String s1, String s2, String s3) {
    super.setdata(s1, s2);
    deptname=s3;
  }
  void display() {
    super.display();
    System.out.println("Department name is : " + deptname);
  }
}
class Professor extends Department
{
   String profname, qualification;
   void setdata(String s1, String s2, String s3,String s4, String s5) {
       super.setdata(s1, s2, s3);
       profname=s4; qualification=s5;
    }
   void display( ) {
      super.display();
      System.out.println("Asst. Professor name is : " + profname);
      System.out.println("Qualification of Professor is : " + qualification);
   }
   public static void main(String ar[]) {
      Professor p1=new Professor();
      p1.setdata("NIST", "Berhampur", "CSE" , "Mr. K. Lakshmi Narayana", "M. Tech");
      p1.display();
   }
}
