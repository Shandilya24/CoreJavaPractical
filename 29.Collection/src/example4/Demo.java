//Ways of traversing the collection
//1.Cursor - 1.iterator(1) 2.listIterator(1) 3.Enumerator(j)
//2.For each loop
//1.Cursor - 2.listIterator
package example4;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>list=new LinkedList<Integer>();
	        list.add(10);
	        list.add(100);
	        list.add(10);
	        list.add(null);
	        
	        ListIterator<Integer> iterator=list.listIterator();
	        while(iterator.hasNext())
	        {
	        	System.out.println(iterator.next());
	        } 
	        while(iterator.hasPrevious())
	        {
	        	System.out.println(iterator.next());
	        } 
	}
}
