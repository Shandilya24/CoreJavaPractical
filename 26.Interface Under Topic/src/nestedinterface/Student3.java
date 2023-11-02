package nestedinterface;

public class Student3 implements OuterInterface,OuterInterface.NestedInterface {
	public void OuterDisplay()
	{
		System.out.println("OuterInterface method overridden");
	}
	public void NestedDisplay()
	{
		System.out.println("NestedInterface method overridden");
	}

}
