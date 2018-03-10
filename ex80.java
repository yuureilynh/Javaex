import java.util.Arrays;

public class ex80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int[] array_nums = {20, 30, 40};
		System.out.println("mang goc: "+Arrays.toString(array_nums)); 
		int max_val = array_nums[0];
		if(array_nums[2] >= max_val)
			max_val = array_nums[2];
		System.out.println("Giá trị lớn hơn giữa yếu tố đầu tiên và cuối cùng: "+max_val); 	 
	}

}
