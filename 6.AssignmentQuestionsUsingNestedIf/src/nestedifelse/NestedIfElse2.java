//Age between 18 to 100
package nestedifelse;

public class NestedIfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=16;
		if(age<=18)
		{
			if(age>=100)
			{
				System.out.println("Valid Age");
			}
			else
			{
				System.out.println("Invalid age as age is less than 18");
			}
		}
		else
		{
			System.out.println("Invalid age as age is greater than 100");
		}

	}

}
