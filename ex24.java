import java.util.Scanner;

public class ex24 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        scan = new Scanner(System.in);
		
        System.out.print("nhap so nhi phan : ");
        binnum = scan.nextInt();
        binnum1=binnum;
     
      while(binnum > 0)
        {
            rem = binnum % 10;
            decnum = decnum + rem*i;
            //System.out.println(rem);
            i = i*2;
            binnum = binnum/10;
        }   

		i=1;
        quot = decnum;
		
        while(quot > 0)
        {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("gia tri bat phan tuong duong " +binnum1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
 System.out.print("\n");

	}

}
