//Three constructors of stringBuilder and stringBuffer
//1.StringBuilder() - (non argumnets cons) - if creates the empty StringBuilder with initied capacity of 16.
//2.StringBuilder(string)
//3.StringBuilder(int) - it creates the empty strigBuilder with specified capacity.
package example14;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());//16
		
		sb.append("Hello");
		System.out.println(sb.capacity());//16
		
		sb.append("JAVA is a programming language");
		System.out.println(sb.capacity());//(old capacity*2)+2=(16*2)+2
	}
}
