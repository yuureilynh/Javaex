import java.util.Scanner;

public class ex28 {
	private static Scanner scan;

	public static int hex_to_decimal(String s)
    {
	      String digits = "0123456789ABCDEF";
          s = s.toUpperCase();
          int val = 0;
          for (int i = 0; i < s.length(); i++)
          {
              char c = s.charAt(i);
              int d = digits.indexOf(c);
              val = 16*val + d;
          }
          return val;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String hexdec_num;
	     int dec_num;
	     scan = new Scanner(System.in);
			
	     System.out.print("nhap vao so thap bat phan: ");
	     hexdec_num = scan.nextLine();
			
	     dec_num = hex_to_decimal(hexdec_num);
			
	     System.out.print("gia tri thap phan tuong ung: " + dec_num+"\n");
		

	}

}
