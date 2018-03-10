import java.util.Scanner;

public class ex21 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int dec_num, quot, i=1, j;
	        int oct_num[] = new int[100];
	        scan = new Scanner(System.in);
			
	        System.out.print("nhap so thap phan: ");
	        dec_num = scan.nextInt();
			
	        quot = dec_num;
			
	        while(quot != 0)
	        {
	            oct_num[i++] = quot%8;
	            quot = quot/8;
	        }
			
	        System.out.print("so bat phan la: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(oct_num[j]);
	        }
			System.out.print("\n");

	}

}
