package casting;

public class UpcastingTest {
	
	public static void main(String[] args) {
		System.out.println("****Super class Method****");
		
		Upcasting x = new Upcasting();
		x.Demo();
		x.Test();
//	    x.StaticCast();    //it is not comment but i make it so it didnt show error it is part of code
		
		
		System.out.println();
		System.out.println("****Sub class Method****");
		
		Upcastinheritance y = new Upcastinheritance();
		y.Demo();
		y.Test();
		y.Subclass();
		
		
		System.out.println();
		System.out.println("****Casting Method****");
 
		//after inheritance is done only then casting will perform
		
		Upcasting z = new Upcastinheritance();
		z.Demo();          //from sub class
		z.Test();         //from sub class
//		z.StaticCast();   //override of this method is not done in subclass    //it is not comment but i make it so it didnt show error it is part of code
		
	System.out.println();
	System.out.println();
	
	System.out.println("****DOWN CASTING****");
	// DOWN CASTING IS NOT DONE IN JAVA
	//SYNTAX FOR DOWN CASTING
	System.out.println("DOWN CASTING IS NOT SUPPORTED IN JAVA");
	
//	    Upcastinheritance w = (Upcastinheritance) new Upcasting();   //it is not comment but i make it so it didnt show error it is part of code
	}
	


}
