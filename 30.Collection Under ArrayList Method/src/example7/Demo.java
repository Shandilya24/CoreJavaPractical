//Array List Method
package example7;

import java.util.List;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>list1=new ArrayList<Integer>();
		 
	        list1.add(10);
	        list1.add(100);
	        list1.add(20);
	        list1.add(10);
	       
	        System.out.println(list1);//[10,100,20,10]
	        System.out.println("----------");
	        
	        List<Integer>list2=new ArrayList<Integer>();
			 
	        list2.add(20);
	        list2.add(100);
	        list2.add(30);
	        
	        list1.removeAll(list2);
	        System.out.println(list1);//[10,10]
	        System.out.println("----------");
	        System.out.println(list2);//[20,100,30]
	}
}
