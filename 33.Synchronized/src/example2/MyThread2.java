package example2;

public class MyThread2 extends Thread
{
	MyClass myClass;
	MyThread2(MyClass myClass)
	{
		this.myClass=myClass;
	}
	public void run()
	{
		myClass.showMsg("Bye");
	}
}
