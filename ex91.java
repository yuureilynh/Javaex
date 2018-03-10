
public class ex91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long thoigiandau = System.nanoTime(); 
			int i;
			System.out.println ("20 so tu nhien dau tien la:\n");
			for (i=1;i<=20;i++)
			{      
				System.out.println (i);
			}
				long Timeuoctinh = System.nanoTime() - thoigiandau;
			System.out.println("Thoi gian uoc tinh bang nano giay de duoc 20 so dau tien la: "+Timeuoctinh);
	}

}
