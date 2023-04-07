package casting;

public class opretors {
	public static void main(String[] args) {
	//&& operator
		
		
		System.out.println( (10>3) && (12>7)); //true
		System.out.println( (10>4) && (12>8)); //unknown  
        System.out.println( (10>3) && (12<7));  //false
		
	// or operator	

		System.out.println( (10>3) || (12>14) ); //true

		System.out.println( (10<3) || (12>7)); //false

	//not operator
		
		System.out.println( !(10==3) ); //true

		System.out.println( !(5>1) ); //false

	}
}
