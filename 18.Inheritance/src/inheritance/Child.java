package inheritance;

public class Child extends Parent {
	void showChild()
	{
		System.out.println("Child class show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		p.showParent();
		
		Child c=new Child();
		c.showChild();
	}

}
