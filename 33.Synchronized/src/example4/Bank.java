package example4;

public class Bank {
	synchronized void withdraw(int amount)
	{
		System.out.println("Withdraw Start...");
		if(amount>3000)
		{
			System.out.println("Insufficient Amount...Deposit the Amount");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Withdraw Completed of Amount...+amount");
	}
    synchronized void deposit(int amount)
    {	
		System.out.println("Deposit Start...");
		System.out.println("Amount Deposited..."+amount);
		notify();
	}
}