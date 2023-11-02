package example5;

public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());//Main
		Thread.currentThread().setName("Parent Thread");
		System.out.println(Thread.currentThread().getName());//Parent Thread
		
		myThread thread1=new myThread();
		myThread thread2=new myThread();
		myThread thread3=new myThread();
		
		thread1.setName("Child Thread1");
		thread1.start();
		thread2.start();
		thread3.start();
		thread2.setName("Child Thread2");
	}
}
