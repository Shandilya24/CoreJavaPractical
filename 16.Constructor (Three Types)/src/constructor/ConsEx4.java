package constructor;

public class ConsEx4 {
     static
     {
    	 System.out.println("static Block");
     }
     ConsEx4()
     {
    	 System.out.println("Non Argument Cons");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Method");
		ConsEx4 c1=new ConsEx4();
	}

}
