import java.util.Scanner;

public class ex53 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
	        System.out.print("so dau tien : ");
	        int x = in.nextInt();  
			System.out.print("so thu hai: ");
			int y = in.nextInt(); 
			System.out.print("so thu ba : ");
	        int z = in.nextInt(); 
	        System.out.print("ket qua: "+abc(x, y, z,true));
			System.out.print("\n");
	    }
	    
	    public static boolean abc(int p, int q, int r, boolean xyz)
	     {
		   if(xyz)
			  return (r > q);
		   return (q > p && r > q);
	}

}
