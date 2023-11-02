package inheritanceexample;

public class Grand
{    
	static void showGrand() 
	{
		System.out.println("Grand");
	}
}
class Parent extends Grand
{
	static void showParent() 
	{
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	static void showChild() 
	{
		System.out.println("Child");
	}
}
class User
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child.showGrand();
        Child.showParent();
        Child.showChild();
	}

}
