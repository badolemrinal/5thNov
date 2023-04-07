package Generalization;

public class TestGeneralisation {
	
	public static void main(String[] args) {
		
	
	System.out.println("*****Specification of JIO******");
    jio x = new jio();
	x.audiocaling();
	x.internet();
	x.textmessage();
	x.NewFeature();
	
	System.out.println();
	
	System.out.println("*****Specification of IDEA*****");
	Idea y = new Idea();
	y.audiocaling();
	y.internet();
	y.textmessage();
	
	System.out.println();
	
	System.out.println("*****Specification of BSNL*****");
	BSNL z = new BSNL();
	z.audiocaling();
	z.internet();
	z.textmessage();
	z.NewFeature();
	}
}
