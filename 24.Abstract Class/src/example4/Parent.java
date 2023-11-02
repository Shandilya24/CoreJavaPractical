//Three types of method example
package example4;

public abstract class Parent {
	public abstract void show1();
	public void show2()
	{
		System.out.println("Non abstract method of parent class");
	}
	public static void show3()
	{
		System.out.println("Non abstract static method of parent class");
	}	
}
