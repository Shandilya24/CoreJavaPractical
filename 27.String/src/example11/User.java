//StringBuffer and StringBuilder
//StringBuilder
package example11;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		String s = "Hello";//Hello
		System.out.println(sb);//Hello
		System.out.println(s);//Hello
		sb.append("Students");
		System.out.println(sb);//HelloStudents
	}

}
