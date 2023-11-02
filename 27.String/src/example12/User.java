//StringBuffer and StringBuilder
//String method
//Do it by own - delete(),replace(),charAt(),length().
package example12;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);//Hello
		sb.insert(1,"Java");
		System.out.println(sb);//HJavaello
		sb.reverse();
		System.out.println(sb);//olleavaJH
	}

}
