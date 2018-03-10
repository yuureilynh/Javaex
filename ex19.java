import java.util.Scanner;

public class ex19 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int dec_num, quot, i=1, j;
	      int bin_num[] = new int[100];
	        scan = new Scanner(System.in);
			
	        System.out.print("so thap phan : ");
	        dec_num = scan.nextInt();
			
	        quot = dec_num;
			
	        while(quot != 0)
	        {
	            bin_num[i++] = quot%2;
	            quot = quot/2;
	        }
			
	        System.out.print("so nhi phan: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(bin_num[j]);
	        }
	        System.out.print("\n");
	
	}

}
