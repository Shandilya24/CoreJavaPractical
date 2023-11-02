package nestedinterface;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 obj1=new Student1();
		Student2 obj2=new Student2();
		Student3 obj3=new Student3();
		
		obj1.OuterDisplay();
		obj2.NestedDisplay();
		obj3.OuterDisplay();
		obj3.NestedDisplay();
	}

}
