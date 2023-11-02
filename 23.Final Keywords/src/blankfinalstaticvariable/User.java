package blankfinalstaticvariable;

public class User {
	static final int No;//Blank final static variable
	static
	{
		No=20;
	}
	public static void display()
	{
		final int NUM=80;
		System.out.println("No="+No);
		System.out.println("NUM="+NUM);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
	}

}

