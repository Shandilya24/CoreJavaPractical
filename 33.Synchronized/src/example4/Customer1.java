package example4;

public class Customer1 extends Thread {
	Bank bank;
	Customer1(Bank bank)
	{
		this.bank=bank;
	}
	public void run()
	{
		bank.withdraw(2000);
	}
}