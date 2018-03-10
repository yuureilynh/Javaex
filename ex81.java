import java.util.Arrays;

public class ex81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {20, 30, 40};
		System.out.println("mang goc: "+Arrays.toString(array_nums)); 
		int x = array_nums[0];
		array_nums[0] = array_nums[array_nums.length-1];
		array_nums[array_nums.length-1] = x;
		System.out.println("Mảng mới sau khi trao đổi các yếu tố đầu tiên và cuối cùng: "+Arrays.toString(array_nums));  
	}

}
