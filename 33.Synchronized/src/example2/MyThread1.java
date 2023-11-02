package example2;

public class MyThread1 extends Thread
{
	MyClass myClass;
	MyThread1(MyClass myClass)
	{
		this.myClass=myClass;
	}
	public void run()
	{
		myClass.showMsg("Hello");
	}
}
