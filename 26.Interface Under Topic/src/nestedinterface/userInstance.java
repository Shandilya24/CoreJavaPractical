package nestedinterface;

public class userInstance {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student1 obj1=new Student1();
		Student2 obj2=new Student2();
		Student3 obj3=new Student3();
		
		User u=new User();
		String str="hello";
		
		System.out.println(obj1 instanceof OuterInterface);
		System.out.println(obj2 instanceof OuterInterface);
		System.out.println(u instanceof OuterInterface);
		System.out.println(u instanceof Object);
		System.out.println(str instanceof Object);
		
	}

}
