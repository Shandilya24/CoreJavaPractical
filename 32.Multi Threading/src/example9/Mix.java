package example9;

import example6.myThread;

public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread thread1=new myThread();
		myThread thread2=new myThread();
		myThread thread3=new myThread();
		
		thread1.start();
		try
		{
			thread1.join();//Other threads will wait till thread1 get terminate
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		thread2.start();
		try
		{
			thread2.join(3000);//Other threads will wait for 3 seconds
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		thread3.start();
	}
}
