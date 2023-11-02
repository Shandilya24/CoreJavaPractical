package example10;

public class myThread {
	public void run()
	{
			System.out.println(Thread.interrupted());
			try
			{
				Thread.sleep(10000);//MilliSeconds
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted");
			}
			System.out.println("Method End");
	}
}
