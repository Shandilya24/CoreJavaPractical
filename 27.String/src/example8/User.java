//String Method
package example8;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello how are you";
		System.out.println(str1);//Hello how are you
		System.out.println(str1.toUpperCase());//HELLO HOW ARE YOU
		System.out.println(str1);//Hello how are you
		System.out.println(str1.toLowerCase());//hello how are you
		System.out.println(str1);//Hello how are you
		System.out.println(str1.length());//17
		System.out.println(str1.charAt(2));//1
		System.out.println(str1.indexOf('e'));//2
		System.out.println(str1.endsWith("You"));//True
		System.out.println(str1.endsWith("You"));//False
		System.out.println(str1.endsWith("You"));//False
		System.out.println(str1.startsWith("Hell"));//True
		System.out.println(str1.startsWith("Hello"));//False
		System.out.println(str1.replace("Hello","Bye"));//Bye how are you
		System.out.println(str1);//Hello how are you
		
	}

}
