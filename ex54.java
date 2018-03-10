import java.util.Scanner;

public class ex54 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
	        System.out.print("so dau tien : ");
	        int x = in.nextInt();  
			System.out.print("Iso thu hai: ");
			int y = in.nextInt(); 
			System.out.print("so thu ba: ");
	        int z = in.nextInt(); 
	        System.out.print("ket qua: "+test_last_digit(x, y, z,true));
			System.out.print("\n");
	    }
	   
	    public static boolean test_last_digit(int p, int q, int r, boolean xyz)
	     {
		     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
	}

}
