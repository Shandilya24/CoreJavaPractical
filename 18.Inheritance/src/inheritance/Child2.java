//Multi-level Inheritance
package inheritance;

public class Child2 extends Father{
	void showChild2()
	{
		System.out.println("Child class show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.showChild2();
		c.showFather();
		c.showGrand();
		}

}
