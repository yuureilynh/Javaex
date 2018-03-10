package javaex2;

import java.util.Scanner;

public class ex109 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);	
	       System.out.print("Nhap vao so nguyen duongr: ");
	        int n = in.nextInt(); 
			if (n>0)
			{
	           System.out.println("So cua hang: "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));	
			}       	
	}

}
