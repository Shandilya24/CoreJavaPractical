package example8;

import example6.myThread;

public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread thread1=new myThread();
		myThread thread2=new myThread();
		
		thread1.start();
		thread2.start();
	}

}
