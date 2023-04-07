package interface1;

public class implementclass implements interfaceA,interfaceB  {
	
	
 //multiple inheritance using interface is possible
 //two parent class and 1 sub class
	
	
	public void Memo() 
	{
		System.out.println("Memo is running");
	}
	
	public void demo()
	{
	 System.out.println("Demo is running");
	}
	
	public void add()
	{
		int a =8;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}
	
	public void basics()
	{ 
		System.out.println("basics is running");
	}
	
	public void sub() 
	{
		System.out.println("sub");
	}
	
	public static void main(String[] args) {
		implementclass c = new implementclass();
		c.Memo();
		c.demo();
		c.add();
		c.basics();
		c.sub();
	}
	
}
