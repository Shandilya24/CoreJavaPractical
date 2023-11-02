//Compare String - (3). Compare to() - Used to check which string literal is bihher return integer value - 0,-ve ,+ve.
package example7;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABC";
		String str2="ACD";
		String str3="ABC";
		
		System.out.println(str1.compareTo(str3));//0
		System.out.println(str1.compareTo(str2));//-1
		System.out.println(str2.compareTo(str1));//1		
	}
}

