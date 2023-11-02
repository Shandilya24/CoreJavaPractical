//Interrupted the SetUp 
package example10;
import example6.myThread; //remove wrong line
public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread thread1=new myThread();
		
		thread1.start();
		thread1.interrupt();
	}

}
