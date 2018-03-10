import java.util.Scanner;

public class ex25 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
	     long octal_num, decimal_num = 0;
	     int i = 0;
	     System.out.print("nhap vao 1 so bat phan bat ky: ");
	    octal_num = in.nextLong();
	    while (octal_num != 0) 
	     {
	      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
	      octal_num = octal_num / 10;
	     }
	    System.out.print("gia tri thap phan tuong duong: " + decimal_num+"\n");

	}

}
