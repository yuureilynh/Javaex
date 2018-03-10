import java.util.Scanner;

public class ex37 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
	        System.out.print("nhap chuoi: ");
	        char[] letters = scanner.nextLine().toCharArray();
	        System.out.print("xuat chuoi: ");
	        for (int i = letters.length - 1; i >= 0; i--) {
	            System.out.print(letters[i]);
	        }
	        System.out.print("\n");

	}

}
