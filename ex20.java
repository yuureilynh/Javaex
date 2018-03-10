import java.util.Scanner;

public class ex20 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec_num, rem;
        String hexdec_num="";
        
        
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        in = new Scanner(System.in);
		
        System.out.print("nhap so thap phan: ");
        dec_num = in.nextInt();
		
        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("so thap luc phan la : "+hexdec_num+"\n"); 

	}

}
