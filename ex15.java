import java.util.Scanner;

public class ex15 {

	private static Scanner k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;

		k = new Scanner(System.in);

		System.out.println("enter 1st and 2nd number :");
		a=k.nextInt();
		b=k.nextInt();

		c=a;
		a=b;
		b=c;

		System.out.println(" Swapped values are :" + a+" and "+b);

	}

}
