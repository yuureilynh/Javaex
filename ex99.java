
public class ex99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_so = {10, 20, 10, 20, 40, 20, 70 };
		int ketqua = 0;	
		int x = 20;
		for(int i = 0; i < array_so.length - 1; i++) {
	        if(array_so[i] != x && array_so[i + 1] != x)
			{
	                                ketqua = 1;	
			}        
	    }                                   
	    if (ketqua==0)
	 	  {
	     	 System.out.printf( String.valueOf(true));	         
		  }
	 else
		   	  {
	     	 System.out.printf( String.valueOf(false));	         
		  }		
	}

}
