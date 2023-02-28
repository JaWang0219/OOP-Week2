import java.util.*;

public class A1113317_0224_1 {

	public static void main ( String[] argv ) {
	
		int number = 0 , oddcheck = 0 ;

		System.out.println( "請輸入任意數:" ) ;

		Scanner sc = new Scanner( System.in ) ;

		number = sc.nextInt() ;
		
		oddcheck = number % 2 ;

		if( oddcheck == 0 )
			{
			System.out.println( "偶數" ) ; 
			}else{System.out.println( "奇數" ) ;}

	}
}