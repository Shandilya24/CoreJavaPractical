package example2;

public class MyClass {
    void showMsg(String Msg)
	{
	    synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(Msg);
			}
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+""+i);
		}
	}
}
