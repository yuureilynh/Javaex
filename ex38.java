
public class ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết một chương trình Java để tính các chữ cái, khoảng trống, số và các ký tự khác của một chuỗi nhập vào
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int kitu = 0;
		int khoangcach = 0;
		int so = 0;
		int khac = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				kitu ++ ;
			}
			else if(Character.isDigit(ch[i])){
				so ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				khoangcach ++ ;
			}
			else{
				khac ++;
			}
		}
		System.out.println("chuoila : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("kitu: " + kitu);
		System.out.println("khoangcach: " + khoangcach);
		System.out.println("so: " + so);
		System.out.println("khac: " + khac);
	}

}
