import java.util.Scanner;
 
class AgeException extends Exception 
{
   public AgeException(String str) 
   {
     System.out.println(str);
   }
}
public class AgeException 
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Age : ");
    int age = sc.nextInt();
  
    try 
    {
     if(age==0) 
      throw new AgeException("Invalid age");
     else
      System.out.println("Valid age");
    }
     catch (AgeException Exc) 
     {
       System.out.println(Exc);
     }
  }
}
