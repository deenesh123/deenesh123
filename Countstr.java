import java.util.*;
import java.lang.*;

class Count
{
    int n;
    String s;

    Count(int n,String s)
    {
       this.n = n;

        this.s = s;
    }

    void calculate(int n)
    {
      int cnt =0 ;
      while(n!=0)
      {
           cnt++;
           n=n/10;
      }
      System.out.println("the toatal digits are "+ cnt);
    }
    void calculate(String s)
    {
         int cnt = 0;
        for(int i=0;i<s.length();i++)
        {
             char p =s.charAt(i);
             if((p >= 'A' && p<='Z') || (p >='a' && p <='z'))
             cnt++;
        }
        System.out.println("the toatal character are "+ cnt);
    }

}

public class Countstr
{
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int n;
      String s;

      System.out.println("enter the number");
      n = sc.nextInt();
      System.out.println("enter the String");
      s = sc.next();

      Count c = new Count(n,s);
      c.calculate(n);
      c.calculate(s);
    }
}
