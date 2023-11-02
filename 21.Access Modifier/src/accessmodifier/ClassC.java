package accessmodifier;

public class ClassC {
    
	void dispaly() 
	{
	  ClassA a = new ClassA();	
	  //System.out .println(a.no1);	
	  //System.out .println(a.no2);	
	  //System.out .println(a.no3);	
	  System.out .println(a.no4);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ClassC c = new ClassC();
		  c.dispaly();
	}

}
