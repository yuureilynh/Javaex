package javaex2;

import java.util.Scanner;

public class ex117 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);	
	        System.out.print("Nhap vao so nguyen duong: ");
	        int n = in.nextInt(); 
	        System.out.printf("an bac hai cua %d la: ",n);
			System.out.println(sqrt(n)); 
	    }
	    
	private static int sqrt(int num) {
	        if (num == 0 || num == 1) {
				return num;
			}
			int x = 0;
			int y = num;
			while (x <= y) {
				int mid = (x + y) >> 1;
				if (num / mid < mid) {
					y = mid - 1;
				} else {
					if (num / (mid + 1) <= mid) {
						return mid;
					}
					x = mid + 1;
				}
	} return x;

}
}
