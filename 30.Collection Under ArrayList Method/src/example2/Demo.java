//Array List Method
package example2;

import java.util.List;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>list=new ArrayList<Integer>();
		 
	        list.add(10);
	        list.add(100);
	        list.add(10);
	        list.add(null);
	        
	        System.out.println(list.contains(40));//false
	        System.out.println(list.contains(10));//true
	        
	        System.out.println(list.get(2));//20
	        System.out.println(list.indexOf(2));//-1
	        System.out.println(list.indexOf(10));//10
	        System.out.println(list.lastIndexOf(2));//3
	        System.out.println(list.isEmpty());//false
	        
	        list.clear();//Remove from the collection
	        System.out.println(list.size());//0
	        System.out.println(list.isEmpty());//true
	}
}
