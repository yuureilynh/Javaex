import java.util.Scanner;

public class ex49 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		 System.out.print("Nhap vao mot so: ");
	     int n = in.nextInt(); 
	            if (n % 2 == 0) {
	                System.out.println(1); 
	               }
				else {
	                System.out.println(0); 
	              }

	}

}
