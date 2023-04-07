
package staticinterface;

public class testdefault2 implements default1 {
	 public void Test()
	 {
		 System.out.println("Testing is running");
	 }
	 public static void main(String[] args) {
		
	
	 testdefault2 c= new testdefault2();
	 c.Test();
	 
	 //default1 x = new default1();
	 //x.Test();
	 //default1 is interface so that why we cannot create object of default1
	 //method overriding is going on
	 } 
}
