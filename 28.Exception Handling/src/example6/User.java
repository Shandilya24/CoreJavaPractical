//Exception propagation is done implicits for uncheked exception.
package example6;

public class User {
    static void A()
    {
     int no=10/0;
    }
    static void B()
    {
      A();
    }
    static void C()
    {
      try
      {
    	  B();
      }
    catch(Exception e)
    {
      System.out.println("obj");
    }
} 
public static void main(String[] args) {
		// TODO Auto-generated method stub
    	C();
	}
}

