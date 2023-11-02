//Array List Method
package example1;

import java.util.List;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>list=new ArrayList<Integer>();
	        {
	        	System.out.println(list);//[]
	        	System.out.println(list.size());//0
	        	
	        	if(list.size()!=0)
	        	{
	        		System.out.println(list);
	        	}
	        	else
	        	{
	        		System.out.println("No Object Found");
	        	}
	        	list.add(10);
	        	list.add(100);
	        	list.add(10);
	        	list.add(null);
	        	
	        	System.out.println(list);//[10,100,10,null]
	        	System.out.println(list.size());//4
	        	
	        	list.add(3,90);
	        	System.out.println(list);
	        	System.out.println(list.size());
	        }  
	}
}
