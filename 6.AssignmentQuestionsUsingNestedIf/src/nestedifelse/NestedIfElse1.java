//If age cannot be negative and zero.
package nestedifelse;

public class NestedIfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		String nation ="India";
		if(age<=0)
		{
			if(nation=="India")
			{
				System.out.println("Invalid Voter");
			}
			else
			{
				System.out.println("Valid Voter");
			}
			
		}
		else
		{
			System.out.println("Age cannot be 0 & negative");
		}
		

	}

}
