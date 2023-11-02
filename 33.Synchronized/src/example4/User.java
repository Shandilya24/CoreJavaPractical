package example4;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		Customer1 c1=new Customer1(bank);
		Customer2 c2=new Customer2(bank);
		
		c1.start();
		c2.start();
	}

}
