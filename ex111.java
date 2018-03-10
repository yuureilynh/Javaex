package javaex2;

import java.util.Scanner;

public class ex111 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x, y ;
		   in = new Scanner(System.in);	
		   System.out.print("Nhap so thu nhat: ");
		   x = in.nextInt(); 
		   System.out.print("Nhap so thu hai: ");
		   y = in.nextInt(); 
	      while(y != 0){
	            int carry = x & y;
	            x = x ^ y;
	            y = carry << 1;
	        }
	        System.out.print("Tong la: "+x); 
			System.out.print("\n");     
	}

}
