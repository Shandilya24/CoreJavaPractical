package constructor;

public class ConsEx3{
	ConsEx3()
	{
		this(20);
		System.out.println("Non Argument Cons");
	}
	ConsEx3(int no)
	{
		System.out.println("Para Cons int="+no);
	}
	ConsEx3(String no)
	{
		this();
		System.out.println("Para Cons String="+no);
		//this()-CTE
	}
	void show()
	{
		//this()-CTE
	}
	public class User{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsEx3 c1=new ConsEx3("Hello");
	  }
	}
}
