package example2;

public class Parent {
	public void show()
	{
		System.out.println("Non abstract method of parent class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.show();
	}

}
