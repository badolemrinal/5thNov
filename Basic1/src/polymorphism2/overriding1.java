package polymorphism2;

public class overriding1 extends overloading1 {
     
	public void common()
	
	{
		int m=20;
		int n=2;
		int total=m*n;
		System.out.println(total);  //overriding
	}
	
	public static void main(String[] args) {
		
		overriding1 x= new overriding1();    //for non static 
		x.add(5, 4);      //coming from super class but changing value
		x.add(4, 5, 6);   //coming from super class but chaning value
		x.common();      // from this class only
		
		
		overloading1.multi(2, 2);  //for static coming from super class
		overloading1.multi(4, 5, 1);
		 
		overloading1 y = new overriding1();  //result from this class
		y.common();
		
		overloading1 z = new overloading1(); //result from super class 
		z.common();
		
}
}
