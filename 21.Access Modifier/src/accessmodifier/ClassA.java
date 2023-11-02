package accessmodifier;

public class ClassA {
    
	int no1 = 10;
	int no2 = 20;
	protected int no3 = 30;
	public int no4 = 40;
	void dispaly() 
	{
	  System.out .println(no1);	
	  System.out .println(no2);	
	  System.out .println(no3);	
	  System.out .println(no4);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassA a = new ClassA();
        a.dispaly();
	}

}
