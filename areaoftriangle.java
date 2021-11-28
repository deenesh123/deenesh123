import java.util.Scanner;

public class areaoftriangle {
	private static Scanner sc;

	public static void main(String[] args) {
		double a, b, c, Perimeter, s, Area;
		sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter Three sides of triangle: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		Perimeter = a + b + c;
		s = (a + b + c)/2;
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.format("\n The Area of triangle = %.2f\n",Area);
	}
}
