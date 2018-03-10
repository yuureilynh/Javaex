import java.nio.charset.Charset;

public class ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết một chương trình Java để liệt kê các bộ ký tự có sẵn trong các đối tượng charset
				System.out.println("danh sach cac bo ky tu co san trong charset: ");  
			    for (String str : Charset.availableCharsets().keySet()) {
			      System.out.println(str);
			    }

	}

}
