class A
{ 
   private int a=5; int b; protected int c; public int d;
   private void display1() {
      System.out.println("Inside private Function");
   }
   void display2() {
      System.out.println("Inside Default Function");
   }
   protected void display3() {
      System.out.println("Inside Protected Function") ;
   }
   public void display4() {
      System.out.println("Inside Public Function");
   }
   int geta() { return a; }
}
class B extends A
{
   public void display() {
      System.out.println("Public function inside class B");
   }
}
class Inheritance
{
   public static void main(String[] args)
   {
     B b1=new B(); //b1.display1(); //Error it is private
     b1.display2();
     b1.display3();
     b1.display4();
     b1.display();
     b1.b=10; b1.c=20; b1.d=30;
     //b1.a=5; //cannot access the private members
     System.out.println("Value of a = "+ b1.geta());
     System.out.println(b1.b + " "+ b1.c+" " + b1.d);
   }
}
