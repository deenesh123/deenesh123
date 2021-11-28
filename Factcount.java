import java.util.Scanner;
public class Factcount {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    int i, count = 0;
    for (i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.println("factors are " + i);
        count++;
      }
    }
    System.out.println("no. of factors of "+n+" are "+count);
  }
}
