package polymorphism;

public class overriding2 extends overriding1 {

	public void Statement() 
	{
		System.out.println("Method from sub class is Running");
	}
	
	public static void main(String[] args) {
		
		overriding2 x = new overriding2();  //method from sub class
		x.Statement();
		
		overriding1 y = new overriding2();  //method overriding
		y.Statement();
		
		overriding1 z = new overriding1();  //method from super class
		z.Statement();
		
	}
}
   

//Method 'Statement' is same in different class but two different body
//we didn't achieve inheritance