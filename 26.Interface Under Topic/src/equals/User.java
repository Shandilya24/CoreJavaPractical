package equals;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User obj1=new User();
		User obj2=new User();
		User obj3=obj2;
		
		System.out.println(obj1.equals(obj2));//false-compare the object reference
		System.out.println(obj2.equals(obj3));//true
		
		if(obj1.equals(obj2))
		{
			System.out.println("Both objects are having same reference");
		}
		else
		{
			System.out.println("Both objects are having different reference");
		}
	}

}
