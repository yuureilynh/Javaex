import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int sum = 0;
			String str = br.readLine();
			char[] numStr = str.toCharArray();
			for (int i = 0; i < numStr.length; i ++) {
				sum += numStr[i] - '0';
			}
			System.out.println("Nhap so nguyen: "+str);
			print_number(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void print_number(int n) {
		int x; int y; int z;
		String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		System.out.println("Tong cac chu so da nhap: "+n);
		if (n < 10) {
			System.out.println(number[n]);
		}
		else if (n < 100) {
			x = n / 10;
			y = n - x *10;
			System.out.println("Bang Tieng Anh: "+number[x] + " " + number[y]);
		}
		else {
			x = n / 100;
			y = (n - x * 100) / 10;
			z = n - x * 100 - y * 10;
			System.out.println("Bang tieng Anh: "+number[x] + " " + number[y] + " " + number[z]);
		}
		
	}

}
