import java.io.* ;

interface IntOperations
{

 public void isPositiveNegative() ;
 public void isEvenOdd() ;
}

class  implements IntOperations
{
 private int number ;


 ass3a2()
 {
 
  this.number=0 ;
 
 }


 ass3a2(int num)
 {
 
  this.number=num ;
 
 }

 public void isPositiveNegative()
 {
  
  if(this.number<0)
   System.out.println("\nNumber Is Negetive...") ;
  
  else
   System.out.println("\nNumber Is Positive...") ;
 
 }

 public void isEvenOdd()
 {
  
  if(this.number%2==0)
   System.out.println("\nNumber Is Even...") ;
  
  else
   System.out.println("\nNumber Is Odd...") ;
 
 }

 public void isPrime()
 {
  
  int i = 2 ;
  
  while(i!=this.number)
  {
  
   if(this.number%i==0)
   {
  
    System.out.println("\nNumber Is Not Prime...") ;
    break ;
   
   }
   i++ ;
  
  }
  
  if(this.number==i)
   System.out.println("\nNumber Is Prime...") ;
 
 }

 public void factorial()
 {
  
  int prod=1 , i=1 ;
  
  while(i<=this.number)
   prod*=i++ ;

  System.out.println("\nFactorial Of Number Is : "+prod) ;
 
 }

 public void sumOfDigits()
 {

  int sum=0 ;
  int i=this.number ;

  while(i!=0)
  {

   sum+=(i%10) ;
   i=i/10 ;

  }

  System.out.println("\nSum Of The Digits Is : "+sum) ;
 
 }

 public static void main(String[] arg) throws Exception
 {
  
  int num = Integer.parseInt(arg[0]) , choice ;
  ass3a2 o = new ass3a2(num) ;
  BufferedReader b = new BufferedReader(new InputStreamReader(System.in)) ;

  while(true)
  {
   
   System.out.println("\n==========Menu========") ;
   System.out.println("\n1.Positive or Negative") ;
   System.out.println("\n2.Even or Odd") ;
   System.out.println("\n3.Prime") ;
   System.out.println("\n4.Factorial") ;
   System.out.println("\n5.Sum of digits") ;
   System.out.println("\n6.Exit") ;
   System.out.println("\n======================") ;
   
   System.out.println("\nEnter your choice here : ") ;
   choice = Integer.parseInt(b.readLine()) ;
   
   switch(choice)
   {
    
    case 1:
      o.isPositiveNegative() ;
      break ;
    
    case 2:
      o.isEvenOdd() ;
      break ;
    
    case 3:
      o.isPrime() ;
      break ;
    
    case 4:
      o.factorial() ;
      break ;
    
    case 5:
      o.sumOfDigits() ;
      break ;
    
    case 6:
      System.exit(0) ;
      break ;
    
    default:
      System.out.println("Invalid choice.\nEnter again :") ;
      break ; 
   
   }
  
  }
 
 }

}
