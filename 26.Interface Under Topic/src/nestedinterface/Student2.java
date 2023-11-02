package nestedinterface;

public class Student2 implements OuterInterface.NestedInterface {
	public void NestedDisplay()
	{
		System.out.println("NestedInterface method overridden");
	}

}
