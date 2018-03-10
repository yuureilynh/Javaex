package javaex2;

import java.util.Arrays;

public class ex104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_so = {11, 15, 13, 10, 45, 20, 53, 44, 18};
	    System.out.println("Nhap mang: "+Arrays.toString(array_so)); 
		
		int l = 0;
		int[] new_array;
		while(array_so[l] != 10)
		  l++;
		new_array = new int[l];
		for(int i = 0; i < l; i++)
			new_array[i] = array_so[i];
		System.out.println("Mang moi: "+Arrays.toString(new_array)); 
	}

}
