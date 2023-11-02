//Ae cannot be negative and zero,age 18 o 100
package nestedif;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		String nation = "Indian";
		if(age>18)
		{
			if(nation =="Indian")
			{
				System.out.println("Valid voter");
			}
			else
			{
				System.out.println("Invalid voter");
			}
		}
		else
		{
			System.out.println("Inalid voter as minor age");
		}

	}

}
