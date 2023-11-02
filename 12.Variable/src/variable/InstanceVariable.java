package variable;

public class InstanceVariable {
	
    String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable s1= new InstanceVariable();
		InstanceVariable s2= new InstanceVariable();
		
		System.out.println(s1.name);//null
		System.out.println(s2.name);//null
		
		s1.name="Abhishek";
		System.out.println(s1.name);//Abhishek
		System.out.println(s2.name);//null
		
	}

}
