import java.util.Arrays;

public class ex93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] so = {10, 9, 8, 6, 5, 3, 20};  
		System.out.println("Nhap mang so nguyen: "+Arrays.toString(so)); 
		    
	    boolean found1010 = false;
	    boolean found2020 = false;
	      
	    for(int i = 0; i < so.length - 1; i++) {
	        if(so[i] == 10 && so[i+1] == 10)
	            found1010 = true;
	                        
	        if(so[i] == 20 && so[i+1] == 20)
	            found2020 = true;
	    }
	   
		System.out.printf( String.valueOf(found1010 != found2020));	
		System.out.printf("\n");
	  }
	}

