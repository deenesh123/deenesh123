import java.util.Scanner;

public class BuzzNO
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a 1st number\n");
    int a = sc.nextInt();
    System.out.println("enter a 2nd number\n");
    int b = sc.nextInt();
    System.out.println("buzz no:");
    for(int i=a;i<=b;i++)
    {
     if(i%10==7&&i%7==0)
      System.out.println(i);
    }
  }
}
