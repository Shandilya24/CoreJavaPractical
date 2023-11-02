package example2;

public class User {
	final int PAN_NO;
	User(final int PAN_NO)
	{
		this.PAN_NO=PAN_NO;
	}
	public void display()
	{
		System.out.println("PAN_NO="+PAN_NO);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User(1020);
		User u2=new User(1022);
		User u3=new User(1024);
		
		u1.display();
		u2.display();
		u3.display();
	}

}
