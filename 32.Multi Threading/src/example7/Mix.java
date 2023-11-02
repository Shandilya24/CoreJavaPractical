package example7;

import example6.myThread;

public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());//5-Default Priority
		
		Thread.currentThread().setPriority(10);//Getting Max_PRIORITY
		System.out.println(Thread.currentThread().getPriority());//1
	
		myThread thread1=new myThread();
		myThread thread2=new myThread();
		
		System.out.println(thread1.getPriority());//Same as main thread priority
		System.out.println(thread2.getPriority());//10
		
		thread1.setPriority(7);//Getting different Priority
		System.out.println(thread1.getPriority());//7
		
		thread2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(thread1.getPriority());//1
		
		//thread1.setPriority(11);//RTE-illegal argument exception as priority can be 1 to 10
		}
}
