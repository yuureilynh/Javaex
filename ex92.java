import java.util.Arrays;

public class ex92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] so = {3, 7, 2, 4, 9, 10, 22, 6, 100, 8,};
		int ctr_chan = 0, ctr_le = 0;
		System.out.println("Nhap mang so nguyen: "+Arrays.toString(so)); 
		    
	    for(int i = 0; i < so.length; i++) {
	        if(so[i] % 2 == 0)
			{         
	          ctr_chan++;
			}
			else
			   ctr_le++;	
	    }                 
	    System.out.printf("\ncac so chan trong mang la: %d",ctr_chan);
		System.out.printf("\nCac so le trong mang: %d",ctr_le);
		System.out.printf("\n");	
	}

}
