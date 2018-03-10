import java.util.Scanner;

public class ex27 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String octal_num, hex_num;
        int decnum;
        in = new Scanner(System.in);
		
        System.out.print("nhap vao so bat phanr : ");
        octal_num = in.nextLine();
		
        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
		
        System.out.print("gia tri thap bat phan tuong duong: "+ hex_num+"\n");

	}

}
