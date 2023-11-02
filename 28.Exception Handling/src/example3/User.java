//nested try catch.
package example3;

public class User {
    void check() {
    try
    {
    	int no=10/0;
    	System.out.println("no");
    	try
    	{
    	int arr[]= {1,2,3};
    	System.out.println(arr[2]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
    	   System.out.println("obj");
        }
    }
    catch(ArithmeticException obj)
    {
      System.out.println("obj");
    }
} 
public static void main(String[] args) {
		// TODO Auto-generated method stub
    	User d = new User();
    	d.check();
	}
}

