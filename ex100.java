import java.util.Arrays;

public class ex100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array_so1 = {10, 11, 10, 20, 43, 20, 50};
		int[] array_so2 = {10, 13, 11, 20, 44, 30, 50};
		System.out.println("Mang1: "+Arrays.toString(array_so1)); 
		System.out.println("Mang2: "+Arrays.toString(array_so2)); 
		int n = 0;
	    
	    for(int i = 0; i < array_so1.length; i++) {
	        if(Math.abs(array_so1[i] - array_so2[i]) <= 1 && array_so1[i] != array_so2[i])
	            n++;
	    }
	                    
	    System.out.printf("Cac so giong nhau: "+n);
		System.out.printf("\n");	 
	}

}
