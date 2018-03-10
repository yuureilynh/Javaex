import java.util.Scanner;

public class ex65 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
	        System.out.print("so dau tien : ");
	        int a = in.nextInt();  
			System.out.print("so thu hai: ");
			int b = in.nextInt(); 
			int divided = a / b;
			int result = a - (divided * b);
			System.out.println(result); 
	}

}
