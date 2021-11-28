import java.util.*;
interface animal
{
	int anilegs=4;
	public void running();
}

interface bird
{
	int birdlegs=2;
	public void flying();
}

class FlyingTiger implements animal,bird
{
	public void legs() \\Concrete method
	{
		int legs=anilegs+birdlegs;
		System.out.println("The total number of legs of the Flying tiger is: "+legs);
	}
	public void running()
	{
		System.out.println("The flying tiger can run!");
	}
	
	public void flying()  \\Concrete method
	{
		System.out.println("The flying tiger can fly also.");
	}
}

public class Q4
{
  public static void main(String args[])
  {
	FlyingTiger FT=new FlyingTiger();
	FT.running();
	FT.flying();
	FT.legs();
  }
}
