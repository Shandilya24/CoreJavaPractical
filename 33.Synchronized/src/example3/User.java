//Static Synchronization
package example3;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 thread1=new MyThread1();
		MyThread2 thread2=new MyThread2();
		
		thread1.start();
		thread2.start();
	}

}
