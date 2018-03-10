package javaex2;

import java.util.Arrays;

public class ex102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_so = {11, 11, 13, 31, 45, 20, 33, 53};
	    int kq = 1; 
		System.out.println("Nhap mang: "+Arrays.toString(array_so)); 
		
		for(int i = 0; i < array_so.length; i++)
	     {
	      	if(array_so[i] == 10 || array_so[i] == 30)
			{	
	  		
			   kq =0;
			}
	      }
		 if (kq==0)
	 	   System.out.printf( String.valueOf(true));	         
	     else
		   System.out.printf(String.valueOf(false));
	}

}
