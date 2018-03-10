
public class ex98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_so = {10, 20, 10, 20, 60, 17, 20};
		
		int dem = 0, ketqua =0;
	    
	    if(array_so.length >= 1 && array_so[0] == 20)
	        dem++;

	    for(int i = 1; i < array_so.length; i++) {
	        if(array_so[i - 1] == 20 && array_so[i] == 20)
			{
	         System.out.printf( String.valueOf(false));	
	         ketqua = 1;
			}                   
	        if(array_so[i] == 20)
	            dem++;
	    }
	                                          
	    if (ketqua==0)
	 	  {
	     	 System.out.printf( String.valueOf(dem == 3));	         
		  }	
		  System.out.printf("\n");	
	}

}
