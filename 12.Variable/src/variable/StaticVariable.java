package variable;

public class StaticVariable {
	
	int rollNo;
	String name;
	static String Cname;//static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s1=new StaticVariable();
		StaticVariable s2=new StaticVariable();
		
		s1.rollNo=101;
		s1.name="Abhishek";
		//s1.CName="ABC College";
		StaticVariable.Cname="ABC College";
		
		System.out.println(s1.rollNo+" "+s1.name+" "+Cname);//101 Abhishek ABC College
		System.out.println(s2.rollNo+" "+s2.name+" "+Cname);//0 null ABC College
	}

}
