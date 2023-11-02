//Three constructors of stringBuilder and stringBuffer
//1.StringBuilder() - (non argumnets cons) - if creates the empty StringBuilder with initied capacity of 16.
//2.StringBuilder(string)
//3.StringBuilder(int) - it creates the empty strigBuilder with specified capacity.
package example13;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());//16
		
		StringBuilder sb2 = new StringBuilder("Hello");
		System.out.println(sb2.capacity());//16+5=21
		
		StringBuilder sb3 = new StringBuilder(20);
		System.out.println(sb3.capacity());//20

	}

}
