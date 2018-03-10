package javaex2;

import java.util.Arrays;

public class ex106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array_so = {11, 15, 13, 10, 20, 45, 30};
	    System.out.println("Nhap vao mang: "+Arrays.toString(array_so)); 
		
		if(array_so.length >1)
	    {          
	    int first = array_so[0];
	              
	    for(int i = 1; i < array_so.length; i++)
	        array_so[i - 1] = array_so[i];
	                        
	    array_so[array_so.length - 1] = first;
		System.out.println("Mang moi: "+Arrays.toString(array_so)); 
		}
	}

}
