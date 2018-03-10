
public class ex96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array_so = {40, 20, 15, 30, 60, 10};
	      boolean testd = false;
		  int result=0;
		  int x = 10;
		  int y = 20;
	    
	    for(int i = 0; i < array_so.length; i++) {
	        if(array_so[i] == x)
	            testd = true;
	                    
	        if(testd && array_so[i] == y)
			{
	         System.out.printf( String.valueOf(true));	
	         result = 1		 ;
			}
	    }
	     if (result==0)                             
		   {	 
	         System.out.printf( String.valueOf(false));
		    }
			System.out.printf("\n");
	}

}
