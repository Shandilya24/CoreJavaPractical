//Lambda Expression
package example2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface d=new MyInterface()
		{
			public void show()
			{
				System.out.println("Show Overriden");
			}
	    };
	    MyInterface d1=new MyInterface()
		{
			public void show()
			{
				System.out.println("Show Overriden");
			}
	    };
	    d.show();
	    d1.show();
	}
}
