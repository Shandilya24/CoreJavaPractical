package example1;

public class MyClass {
    synchronized void showMsg(String msg) {
    	for(int i=1;i<5;i++)
    	{
    		System.out.println(msg);
    	}
    }
}
