package thiskeyword;

public class Employee {
	
	int eno;
	String name;
	void setValue(int eno, String name){
		// TODO Auto-generated method stub
		this.eno=eno;
		this.name=name;
	}
     void show()
    {
	System.out.println("EmpNo="+eno+"Name="+name);
    }
public static void main(String a[]) {
	Employee e1 = new Employee();
	e1.setValue(101,"Abhishek");
	e1.show();
	
	Employee e2 = new Employee();
	e2.setValue(102,"Abhi");
	e2.show();
}
}