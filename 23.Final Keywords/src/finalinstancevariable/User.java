package finalinstancevariable;

public class User {
	final int No=10;//Final instance variable
	public void display()
	{
		System.out.println("No="+No);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		u.display();
	}

}
