package example6;

public class myThread extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+""+Thread.currentThread().getId());
	}
}
