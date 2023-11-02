//default,parameterized,non
package example3;

abstract class MyAbstract {
	
		public void Parent()
		{
			System.out.println("Parent class non argument constructor");
		}
		public void Parent(int no)
		{
			System.out.println("Parent class parameterized  constructor"+no);
		}
}
class Child1 extends MyAbstract{
		public void Child()
		{
			System.out.println("Child class constructor");
		}
		public void Child(int no)
		{
			System.out.println("Child class  parameterized constructor"+no);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 c1=new Child1();
		c1.Child();
		c1.Child(20);
		c1.Parent();
		c1.Parent(10);
	}
}
