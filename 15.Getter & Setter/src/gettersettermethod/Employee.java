//Entity/Model/Pojo class-Setter Method + Getter Method + Cons + toString()
//Setter - Set value in private data member outside the class.
//Getter - get value in private data member outside the class.
package gettersettermethod;

class Employee{
      private int empId;
      private String name;
      public void setEmpId(int empId)
      {
         this.empId=empId;
      }
      public void setName(String name)
      {
    	 this.name=name;
      }
      public int getEmpId()
      {
    	  return empId;
      }
      public String getName()
      {
    	  return name;
      }
}
class Test1{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setName("Mohan");
		System.out.println(e1.getEmpId());
		System.out.println(e1.getName());
		
		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setName("Ram");
		System.out.println(e2.getEmpId());
		System.out.println(e1.getName());
 }
} 