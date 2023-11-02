//Single-level Inheritance
package inheritance;

public class Child1 extends Parent1{
	void showChild1()
	{
		System.out.println("Child class show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c = new Child1();
		c.showChild1();
		c.showParent1();
		}

}
