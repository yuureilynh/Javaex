package javaex2;

import java.util.Arrays;

public class ex105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_so = {11, 15, 13, 10, 45, 20, 11, 15};
	    System.out.println("Nhap mang: "+Arrays.toString(array_so)); 
		
		int kq = 0;
		int l = 2;
	    int batdau = 0;
		int ketthuc = array_so.length-l;
		for(; l > 0; l--)
		{
			if(array_so[batdau] != array_so[ketthuc])
				kq = 1;
			else
			{
				batdau++;
				ketthuc++;
			}
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
