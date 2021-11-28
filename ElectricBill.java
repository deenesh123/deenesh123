class Consumer
{
  String name, type; int num;
  Consumer (String n, int a, String t) {
    name = n; num = a; type=t;
  }
  void display( ) {
    System.out.println("Consumer Name: " +name + ",Number: " +
    num + " and Type: " + type);
  }

}
class ElectricBill extends Consumer
{
   int prev, pres;
   ElectricBill(String n, int a, String t, int prv, int prs)
   { 
     super(n, a, t);
     prev=prv; pres=prs;
   }
   double billamount()
   { 
     double bill=0; int units=pres-prev;
     switch(type)
     {
     case "Domestic":
        if(units>200) { bill =bill + (units-200)* 5.0; units=200; }
        if(units >50) { bill =bill + (units-50)* 3.0; units=50; }
        if(units <=50) bill =bill + units * 1.5; break;
     case "Commercial":
        if(units>100) { bill =bill + (units-100)* 6.0; units=100; }
        if(units <=100) bill =bill + units * 2.5;

   }

    return bill;
}
void display()
{
   super.display(); //calls the super class methods
   System.out.println("Previous Reading :: "+prev+", and Present Reading::"+pres);
   System.out.println("Bill Amount :: Rs."+ billamount());
}

  public static void main(String ar[])
  {
    ElectricBill b1=new ElectricBill("Steven", 408, "Domestic", 300, 550);
    b1.display();
    ElectricBill b2=new ElectricBill("James", 105, "Commercial", 500, 650);
    b2.display();
  }
}
