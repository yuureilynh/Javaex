import java.util.Scanner;

public class ex33 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
	        System.out.print("nhap so: ");
	        long n = input.nextLong();
	        System.out.println("tong cac con so: " + sumDigits(n));

	    }

	    public static int sumDigits(long n) {
	        int sum = 0;
	        while (n != 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;

	}

}
