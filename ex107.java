package javaex2;

import java.util.Arrays;

public class ex107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_so = {11, 12, 13, 14, 45, 20};
	    System.out.println("Nhap mang: "+Arrays.toString(array_so)); 
		int kq =1;
		
	      for(int i = 0; i <= array_so.length - 3; i++) {
	        if(array_so[i] + 1 == array_so[i+1] && array_so[i+1] + 1 == array_so[i+2])
	            kq =0;
	    }
	                
		if (kq==1)
		 {
		  System.out.printf(String.valueOf(false));
		 }
		else
		 {
		   System.out.printf(String.valueOf(true));
		 }
		 System.out.printf("\n");
	}

}
