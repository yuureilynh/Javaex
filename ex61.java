import java.util.Scanner;

public class ex61 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		     System.out.print("\nnhap : ");
			 String word = in.nextLine();
			 word = word.trim();
			 String result = ""; 
		     char[] ch=word.toCharArray();  
			 for (int i = ch.length - 1; i >= 0; i--) {
					 result += ch[i];
				 }
			 System.out.println("ket qua dao nguoc: "+result.trim());

	}

}
