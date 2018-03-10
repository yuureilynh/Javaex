import java.util.Scanner;

public class ex11 {


	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		float S, P;
		r = SoThuc("R = ");
		S = (float) (r*r * 3.14);
		P = (float) (2*r * 3.14); 
		System.out.println("S tron = "+ S);
		System.out.println("P tron = "+ P);

	}
	public static double SoThuc (String str) {
		double x;
		sc = new Scanner(System.in);
		System.out.println(str);
		x = sc.nextDouble();
		return x;
	}
}
