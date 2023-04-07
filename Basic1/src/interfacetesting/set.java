package interfacetesting;

public class set implements system {
	
	public void Define()  //Incomplete method of system are being completed in SET
	{
		System.out.println("xyz");
	}
	
	public void getup () 
	{
		System.out.println("asd");
	}
	
	public static void main(String[] args) {
		set x = new set();
		
	     x.getup();
	     x.Define();
  }
}
