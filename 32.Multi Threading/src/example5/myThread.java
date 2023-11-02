package example5;

public class myThread extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		System.out.println(Thread.currentThread().getName());
	}
}
