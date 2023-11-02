package finalstaticvariable;

public class User {
	static final int NO=10;//Final static variable
	public void display()
	{
		System.out.println("NO="+NO);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		u.display();
	}

}
