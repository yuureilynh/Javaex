import java.util.Scanner;

public class ex13 {

	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b;
		float S, P;
		a = SoThuc ("a = c.rog = ");
		b = SoThuc ("b = c.dai = ");
		S = (float)(a * b);
		P = (float)(2 * (a + b));
		System.out.println("S hcn = " + S);
		System.out.println("P hcn = " + P);
 

	}
	public static double SoThuc (String str) {
		double x;
		sc = new Scanner(System.in);
		System.out.println(str);
		x = sc.nextDouble();
		return x;
	}

}
