//Lambda Expression
package example6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{System.out.println("Thread is running...");};
	    Thread t=new Thread(r);
	    t.start();
		
		//Thread t=new Thread(()->System.out.println("Thread is running..."));
		//t.start();
		
		//new Thread(()->System.out.println("Thread is running...")).start();
	}
}
