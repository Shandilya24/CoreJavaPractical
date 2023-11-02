package hashCode;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User obj1=new User();
		User obj2=new User();
		
		String str1="hello";
		String str2="student";
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
