package javaex2;

import java.util.Arrays;

public class ex101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array_so = {10, 11, 10, 30, 45, 20, 33, 53};
	    System.out.println("Nhap mang: "+Arrays.toString(array_so)); 
	    
		int n1 = 0;
	    int n2 = 0;
	      
	    for(int i = 0; i < array_so.length; i++) {
	        if(array_so[i] == 10)
	            n1++;
	                        
	        if(array_so[i] == 20)
	            n2++;
	    }                                      
	    System.out.printf(String.valueOf(n1 > n2));
		System.out.printf("\n");
	}

}
