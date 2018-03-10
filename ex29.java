import java.util.Scanner;

public class ex29 {
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
	        int dec_num, i=1, j;
	        int bin_num[] = new int[100];
	        scan = new Scanner(System.in);
			
	        System.out.print("so thap luc phan : ");
	        hexdec_num = scan.nextLine();
	        
	       
	        dec_num = hex_to_decimal(hexdec_num);
	        
	             
	        while(dec_num != 0)
	        {
	            bin_num[i++] = dec_num%2;
	            dec_num = dec_num/2;
	        }
			
	        System.out.print("gia tri nhi phan tuong ung: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(bin_num[j]);
	        }
	        System.out.print("\n");

	}

}
