//Non-Runnable
package example8;

public class myThread {
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(2000);//MilliSeconds
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
