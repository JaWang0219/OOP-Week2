import java.util.*;

public class A1113317_0224_2 {

	public static void main ( String[] argv ) {
	
		int number = 0 , fahrenheit = 0 ;

		System.out.println( "請輸入攝氏溫度的值:" ) ;

		Scanner sc = new Scanner( System.in ) ;

		number = sc.nextInt() ;
		
		fahrenheit = number*9/5 + 32 ;

	
		System.out.println( "華式溫度 = " + fahrenheit +"度" ) ; 
	}
}