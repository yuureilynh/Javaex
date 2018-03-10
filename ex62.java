import java.util.Scanner;

public class ex62 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
	        System.out.print("so thu nhat : ");
	        int x = in.nextInt();  
			System.out.print("so thu hai: ");
			int y = in.nextInt(); 
			System.out.print("so thu ba : ");
	        int z = in.nextInt(); 
	        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
	}

}
