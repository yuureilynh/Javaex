import java.util.Arrays;

public class ex94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_so = { 5, 7, 9, 8, 1, 4, 6};
		  
		int i = 0;
	    System.out.println("Nhap so vao mang: "+Arrays.toString(array_so)); 
	    while(i < array_so.length && array_so[i] % 2 == 0)
	        i++;
	              
	    for(int j = i + 1; j < array_so.length; j++) {
	        if(array_so[j] % 2 != 0) {
	            int temp = array_so[i];
	            array_so[i] = array_so[j];
	            array_so[j] = temp;
	            i++;
	        }
	    }                                                    
	  
		 System.out.println("Mang sau khi sap xep le chan: "+Arrays.toString(array_so)); 
	}

}
