//Deafult Constructor chaining inheritance using super keyword
package constructorchaining;

public class Grand {
	
    Grand()
    {
    	super();//immediate parent class cons
    	System.out.println("Grand Cons");
    }
}
class Parent extends Grand {   
	 
	 Parent()
	 {
	    super();//immediate parent class cons
	    System.out.println("Parent Cons");	 
     }
 }
class Child extends Parent {
	 
	 Child()
	 {
	    super();//immediate parent class cons
		System.out.println("Child Cons");	  
	 }
public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child c = new Child();
	}

}
