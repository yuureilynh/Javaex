import java.util.Scanner;

public class ex32 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
        int number1;   
        int number2;   
      
        System.out.print( "so dau tien: " );      
        number1 = input.nextInt(); 
 
        System.out.print( "so thu hai: " );   
        number2 = input.nextInt();              
        
        if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 ); 

	}

}
