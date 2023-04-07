package polymorphism;

public class overloading {
// overloading for nonstatic	
//Differentiation of method  on the basics of argument
	
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	

public static void main(String[] args) {
	
	//overloading is possible for non static as well as static
	
	overloading c = new overloading();
	c.add(4, 5);
	c.add(4, 5, 5);

	
}
}
