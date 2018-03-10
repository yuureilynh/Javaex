import java.util.Scanner;

public class ex5 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
        sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
 
        System.out.print("b = ");
        b = sc.nextInt();
 
        System.out.format("a * b = %d", (a * b));


	}

}
