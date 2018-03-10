import java.io.Console;

public class ex42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;
			try {
				pass_ward = cons.readPassword("Nhap vao password:");
				System.out.println("Password ban da nhap: " + new String(pass_ward));
			} finally {
				if (pass_ward != null) {
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("Khong the hien mat khau, vui long thu lai");
		}

	}

}
