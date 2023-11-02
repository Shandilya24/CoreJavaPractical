package example2;

public class User {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.setEno(102);
		emp1.setEname("Abhi");//initializing the partial object
		emp1.setSalary(30000.3f);
		System.out.println(emp1.getEno() + " " + emp1.getEname() +" "+ emp1.getSalary());
		
		Employee emp2=new Employee(101,"Abhi",30000f);
		System.out.println(emp2);//accessing the complete object
	}

}
