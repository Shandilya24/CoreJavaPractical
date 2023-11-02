//Way of Creating class 1.Using Thread Class , 2.Using Runnable Interface
//2.Using Runnable Interface
package example3;

public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread myThread1=new myThread();
		Thread thread1=new Thread();
		thread1.start();//run() method of Thread class will be called.
		
		myThread myThread2=new myThread();
		Thread thread2=new Thread(myThread2);
		thread2.start();//run() method of myThread class will be called.	
	}
}
