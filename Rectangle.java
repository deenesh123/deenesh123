class Rectangle
{
  int length, width;
  Rectangle (int a, int b) {
    length=a; width=b;
  }
  void show( ) {
    System.out.print("Length = "+length+", Width = "+width);
  }
  int area(){ return length*width; }
}
class Box extends Rectangle
{
  int height;
  Box(int a,int b,int c)
  {
    super(a, b); //calling super class constructor to initialize len and breadth
    height=c;
  }
  void show( ) {
     super.show();
     System.out.println(", and Height = "+height);
  }
  int volume() {
     return area()*height;
  }
  public static void main(String args[ ])
  {
     Box b=new Box(5,4,3);
     b.show();
     b.show(); 
     System.out.println("Volume of Box " + b.volume());
  }
}
