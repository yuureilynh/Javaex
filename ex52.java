import java.util.Scanner;

public class ex52 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
	        System.out.print("NHAP SO DAU TIEN : ");
	        int x = in.nextInt();  
			System.out.print("N HAP SO THU HAI: ");
			int y = in.nextInt(); 
			System.out.print("NHAP SO THU BA : ");
	        int z = in.nextInt(); 
	        System.out.print("ket qua: "+sumoftwo(x, y, z));
			System.out.print("\n");
	    }
	    
	    public static boolean sumoftwo(int p, int q, int r)
	      {	
	         return ((p + q) == r || (q + r) == p || (r + p) == q);	
	         
	}

}
