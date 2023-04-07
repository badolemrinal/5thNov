package polymorphism;

public class overloading2 {
//overloading for static	
	public static void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		overloading2.add(4,5);
		overloading2.add(1,5,2);
		
		
	}
	

}
