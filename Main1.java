class overload
{
    overload(double b,double h)
    {
        double area=(b*h)/2;
        System.out.println("the area of the triangle is "+area);
    }
    overload(int x, int y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    overload(int x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class Main1
{
     public static void main(String args[]) 
     {
	   overload ob1 = new overload(2.1,3.2);
           overload ob2 = new overload(2,3);
           overload ob3 = new overload(2); 
     }
}
