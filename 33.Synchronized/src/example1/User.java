//Synchronized Method
package example1;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass=new MyClass();
		MyThread1 thread1=new MyThread1(myClass);
		MyThread2 thread2=new MyThread2(myClass);
		
		thread1.start();
		thread2.start();
	}

}
