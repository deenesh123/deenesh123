public class Swap
{
  void swap(int a,int b)//number function
  {
     a=a+b;
     b=a-b;
     a=a-b;
  }
}
public class Swapping
{
  public static void main(String args[])
  {
    int a=50,b=100;
    Swap sp=new Swap();
    System.out.println("Values Before Swap ####");
    System.out.println("a ="+a +"and b ="+b);
    sp.swap(a,b);
    System.out.println("Values After Swap #####");
    System.out.println("a ="+a +"and b ="+b);
  }
}
