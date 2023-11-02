package blankfinalinstancevariable;

public class User {
	final int No;//Blank final instance variable
	User()
	{
		No=20;
	}
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
