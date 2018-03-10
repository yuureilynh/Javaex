import java.util.Scanner;

public class ex26 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		  int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
		  long octal_num, tempoctal_num, binary_num, place;
		  int rem;
		  System.out.print("nhap 1 so bat phan bat ky: ");
		  octal_num = in.nextLong();
		  tempoctal_num = octal_num;
		  binary_num = 0;
		  place = 1;
		  while (tempoctal_num != 0)
		  {
		   rem = (int)(tempoctal_num % 10);
		   binary_num = octal_numvalues[rem] * place + binary_num;
		   tempoctal_num /= 10;
		   place *= 1000;
		  }
		  System.out.print("gia tri nhi phan tuong duong: " + binary_num+"\n");

	}

}
