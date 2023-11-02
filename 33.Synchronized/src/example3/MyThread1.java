package example3;

public class MyThread1 extends Thread
{
	public void run()
	{
		MyClass.showMsg("Hello");
	}
}
