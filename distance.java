import static java.lang.Math.*;//importing static methods
class distance
{
  double x,y;
  point(double a, double b)
  {
    x = a;
    y = b;
  }
  double distance(point p1, point p2)
  {
    return sqrt(pow((p2.x-p1.x),2) + pow((p2.y-p1.y),2));
  }
  public static void main(String args[])
  {
    point p1=new point(3,4);
    point p2=new point(6,8);
    System.out.println("Distance between the two point is :",p1 distance(p1,p2));
  }
}
