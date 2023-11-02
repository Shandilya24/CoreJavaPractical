package example2;

import java.util.LinkedList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer>list=new LinkedList<Integer>();
		
		list.add(10);
		list.add(63);
		list.add(45);
		list.add(20);
		
		System.out.println(list);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())  
		{
			Integer no=(Integer)itr.next();
			if(no%2==0)
			{
				System.out.println(no);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(list);
	}

}
