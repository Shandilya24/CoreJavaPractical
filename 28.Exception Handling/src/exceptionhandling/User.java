package exceptionhandling;

public class User {
    void check()
    {
    	System.out.println("Check Start");
    
    try
    {
    	int no=10/0;
    	System.out.println("no");
    }
    catch(ArithmeticException obj)
    {
    	System.out.println("obj");
    }
    System.out.println("Check End");
    }
 public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println("Main Start");
    	User d = new User();
    	d.check();
    	System.out.println("Main End");
	}
}

