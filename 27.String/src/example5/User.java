//Compare String - (1). equals()
package example5;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2="Student";
		String str3=new String("Hello");
		
		System.out.println(str1.equals(str2));//False
		System.out.println(str1.equals(str3));//False
	}

}
