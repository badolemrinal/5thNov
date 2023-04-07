package polymorphism2;

public class overloading1 {
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a , int b , int c)
	{
	    System.out.println(a+b+c);	
	}
	
	public  static void multi(int a , int b)
	{
	    System.out.println(a*b);	
	}
	
	public static void multi(int a , int b , int c)
	{
	    System.out.println(a*b*c);	
	}
	
	
	public void common()
	{
		int m=10;
		int n=11;
		int total=m*n;
		System.out.println(total);
	}
	public static void main(String[] args) {
		overloading1 x =new overloading1();
		x.add(4, 5);
		x.add(1, 1, 2);
		
		multi(10,2);
		multi(1,2,4);
		
		x.common();
		
		
		
		
	}
}
