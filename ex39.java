
public class ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết một chương trình Java để tạo và hiển thị số ba chữ số duy nhất bằng cách sử dụng 1, 2, 3, 4. Đồng thời đếm bao nhiêu con số ba chữ số
				int a = 0;
				for(int i = 1; i <= 4; i++){
					for(int j = 1; j <= 4; j++){
						for(int k = 1; k <= 4; k++){
							if(k != i && k != j && i != j){
								a++;
								System.out.println(i + "" + j + "" + k);
							}
						}
					}
				}
				System.out.println("tong ba chu so la " + a);

	}

}
