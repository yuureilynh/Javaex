import java.util.Scanner;

public class ex55 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
	        System.out.print("nhap so giay: ");
			int seconds = in.nextInt(); 
	        int p1 = seconds % 60;
	        int p2 = seconds / 60;
	        int p3 = p2 % 60;
	        p2 = p2 / 60;
	        System.out.print( p2 + ":" + p3 + ":" + p1);
			System.out.print("\n");
	}

}
