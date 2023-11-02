//StringBuffer and StringBuilder
//StringBuffer
package example10;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		String s = "Hello";//Hello
		System.out.println(sb);//Hello
		System.out.println(s);//Hello
		sb.append("Students");
		System.out.println(sb);//HelloStudents
	}

}
