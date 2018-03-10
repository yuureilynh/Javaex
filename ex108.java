package javaex2;

import java.util.Scanner;

public class ex108 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);	
	       System.out.print("Nhap vao so nguyen duong: ");
	        int n = in.nextInt(); 
			if (n>0)
			{
	           System.out.print("So le la: "+(n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
			}
			System.out.println("\n");  
	}

}
