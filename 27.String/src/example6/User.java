//Compare String - (2). Operators(==) - Compare the reference
package example6;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2="Student";
		String str3=new String("Hello");
		String str4="Hello";
		
		System.out.println(str1==str2);//False
		System.out.println(str1==str3);//False
		System.out.println(str1==str4);//True
	}

}
