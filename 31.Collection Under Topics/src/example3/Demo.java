package example3;

import java.util.HashSet;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer>set=new HashSet<Integer>();
		
		set.add(10);
		set.add(45);
		set.add(63);
		set.add(95);
		set.add(null);
		set.add(null);
		
		System.out.println(set.add(50));
		System.out.println(set.add(10));
		System.out.println(set);
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())  
		{	
		  System.out.println(set);
        }
	}
}


