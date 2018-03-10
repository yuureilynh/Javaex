import java.util.Scanner;

public class ex51 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
        System.out.print("NHAP CHUOI: ");
        String str1 = in.nextLine();
		int result = Integer.parseInt(str1);
        System.out.printf("GIA TRI SO NGUYEN: %d",result);
		System.out.printf("\n");

	}

}
