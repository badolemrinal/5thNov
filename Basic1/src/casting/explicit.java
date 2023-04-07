package casting;

                   //HIGHER TO LOWER CASTING//
                     //EXPLICIT CASTING//
public class explicit {


  public static void main(String[] args) {

      double a =140;      //memory size is 8 byte
      System.out.println(a);

      int b = (int)a;             //memory size is 4 byte
      System.out.println(b);

      byte c = (byte)b;         //memory size is 1 byte
      System.out.println(c);

//for explicit we got higher to lower o we have to mention
// int b=(int)a so that system doesn't show error
// and we can convert into lower
      
      
      //140-127=13
      //so for byte range is from -128 to 127
      //so for byte it will subtract from 127 because of the range and 
      //-128-13= -116
}
}
