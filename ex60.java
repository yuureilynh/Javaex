import java.util.Scanner;

public class ex60 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
	     System.out.print("nhap cau: ");
		 String line = in.nextLine();
		 String[] words = line.split("[ ]+");
		 System.out.println("tu gan cuoi: "+words[words.length - 2]);
	}

}
