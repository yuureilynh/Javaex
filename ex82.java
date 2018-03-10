import java.util.Arrays;

public class ex82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {20, 30, 40, 50, 67};
		System.out.println("mang goc: "+Arrays.toString(array_nums)); 
		int max_val = array_nums[0];
		if(max_val <= array_nums[array_nums.length-1])
			max_val = array_nums[array_nums.length-1];
		if(max_val <= array_nums[array_nums.length/2])
			max_val = array_nums[array_nums.length/2];
		System.out.println("Phần tử lớn nhất giữa giá trị đầu tiên, cuối cùng và trung bình: "+max_val);  
	}

}
