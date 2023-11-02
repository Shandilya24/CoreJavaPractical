//Parametresized Constructor chaining inheritance using super keyword
package constructorchaining;

public class Grand1 {
	
    Grand1(int no)
    {
    	System.out.println("Grand Cons"+no);
    }
}
class Parents extends Grand1 {   
	 
	 Parents(int no)
	 {
	    super(20);
	    System.out.println("Parent Cons"+no);	 
     }
 }
class Sub extends Parents {
	 
	Sub(int no)
	 {
	    super(no);//immediate parent class cons
		System.out.println("Child Cons"+no);	  
	 }
public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sub c = new Sub(10);
	}

}
