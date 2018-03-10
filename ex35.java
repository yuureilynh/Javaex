import java.util.Scanner;

public class ex35 {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
	        System.out.print("so mat cua hinh da giac: ");
	        int ns = input.nextInt();
	        System.out.print("kich thuoc cua 1 canh: ");
	        double side = input.nextDouble();
	        System.out.print("dien tich la: " + polygonArea(ns, side)+"\n");
	    }
	    public static double polygonArea(int ns, double side) {
	        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
	        
	        

	}

}
