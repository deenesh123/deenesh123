import java.util.*;

abstract class Animal
{
	abstract void blood(); 
	void eat()
	{
		System.out.println("An animal can eat its food.");
	}
}

class Mammal extends Animal
{
	void blood() 
	{
		System.out.println("All mammals have blood inside them.");
	}
}


public class Q5
{
  public static void main(String args[])
  {
    Mammal mam=new Mammal();
    mam.eat();  
    mam.blood();

  }
}
