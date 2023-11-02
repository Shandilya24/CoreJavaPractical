package example4;

public class Customer2 extends Thread {
	Bank bank;
	Customer2(Bank bank)
	{
		this.bank=bank;
	}
	public void run()
	{
		bank.deposit(4000);
	}
}
