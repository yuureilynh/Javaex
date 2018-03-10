import java.util.Scanner;

public class ex12 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		sc = new Scanner(System.in);
		System.out.println("a = ");
		a = sc.nextInt();
		
		System.out.println("b = ");
		b = sc.nextInt();
		
		System.out.println("c = ");
		c = sc.nextInt();
		
		System.out.format("(a + b + c) / 3 = %d", ((a + b + c)/ 3));

	}

}
