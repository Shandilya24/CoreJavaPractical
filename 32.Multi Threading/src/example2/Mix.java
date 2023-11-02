//If i we call Multi-threading directly.
package example2;

public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo thread1=new Demo();
		Demo thread2=new Demo();
		Demo thread3=new Demo();
		
		/*
		 thread1.start();
		 thread2.start();
		 thread3.start();
	   */
		
		thread1.run();
		thread2.run();
		thread3.run();
	}
}
