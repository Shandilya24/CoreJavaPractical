package example3;

public class MyClass {
	    synchronized static void showMsg(String msg)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(msg);
			}
		}
}
