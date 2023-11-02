//try with multiple catch it must be written in specific to general order.
package example2;

public class User {
    void check() {
    try
    {
    	int no=10/0;
    	int arr[]= {1,2,3};
    	System.out.println("no");
    	System.out.println(arr[2]);
    }
    catch(ArithmeticException obj)
    {
    	System.out.println("obj");
    }
    catch(ArrayIndexOutOfBoundsException obj)
    {
    	System.out.println("obj");
    }
    catch(Exception obj)
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

