package constructor;

public class ConsEx1{
    
	 ConsEx1(){
		System.out.println("Non Argument Cons");
	}
	 ConsEx1(int no){
			System.out.println("Para Cons"+no);
		}
	public class User{
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsEx1 c1=new ConsEx1();
		ConsEx1 c2=new ConsEx1(10);		

	    }

     }
}