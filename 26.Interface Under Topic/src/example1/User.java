package example1;

public class User {
	static User obj1 =new User();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User obj2=new User();
		User obj3= obj2;
		String str="hello";
		Integer no=10;
		
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(str);
		System.out.println(no);
		
	}

}
