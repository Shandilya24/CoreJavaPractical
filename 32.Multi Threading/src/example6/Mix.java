package example6;

public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+""+Thread.currentThread().getId());
	
		myThread thread1=new myThread();
		myThread thread2=new myThread();
		
		thread1.start();
		thread2.start();
	}
}
