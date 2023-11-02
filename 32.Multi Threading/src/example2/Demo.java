package example2;

public class Demo extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		System.out.println("Thread is running..."+i);
	}
}
