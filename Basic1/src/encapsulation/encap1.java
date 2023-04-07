package encapsulation;
// abstract encapsulation generalize
public class encap1 {
	
	private int a =10;
	private int b= 10;
 
	encap1() //constructor
	{
		a=22;
     	b=22;
	}
	
	encap1(int c, int d)
	{
       a=c;
	   b=d;
		
	}
	
	public void Demo()
	{
		int c=a+b;
		System.out.println(c);
	}
	
	
	 public static void main(String[] args) {
		encap1 x = new encap1();
		x.Demo();
	}
}
