import java.util.Scanner;
 
class AgeException extends Exception 
{
   public AgeException(String str) 
   {
     System.out.println(str);
   }
}
public class AgeExc 
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("NAME= Deenesh Kumar Sabat \nROLL NO=201940363 \nSET=ODD\n");
    System.out.print("Enter Your Age : ");
    int age = sc.nextInt();
  
    try 
    {
     if(age==0) 
      throw new AgeException("INVALID AGE");
     else
      System.out.println("VALID AGE");
    }
     catch (AgeException Exc) 
     {
       System.out.println(Exc);
     }
  }
}
