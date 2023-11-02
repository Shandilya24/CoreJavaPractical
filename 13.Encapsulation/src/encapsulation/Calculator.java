package encapsulation;

public class Calculator {
	
	private int no1=10,no2=2;//data hiding
	public void sum()
	{
		System.out.println(no1+no2);
	}
	public void sub()
	{
		System.out.println(no1-no2);
	}
    public class user{
    	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.sum();
		calc.sub();
		//System.out.println(calc.no1*calc.no2);//CTE
        
	}

}
    
}
