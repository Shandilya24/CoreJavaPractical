package loop;

public class WhileForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=123;
		int store=0;
		int sum=0;
		while(no!=0)
		{
			store=no%10;
			no=0/10;
			sum=sum+store;
			System.out.println("Sum of all  digits="+sum);
		}
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
		}

	}

}
