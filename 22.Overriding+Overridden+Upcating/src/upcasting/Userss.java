package upcasting;

public class Userss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parent p;
        p=new Child1();//upcasting
        p.show();//Child1 class method runtime binding,based on object
        p.display();//Parent class method
        
        p=new Child2();//upcasting
        p.show();//Child2 class method 
        p.display();//Parent class method
	}

}
