package example7;

import java.util.LinkedHashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
		
		map.put(101,"Amit");
		map.put(102,"Sumit");
		map.put(null,"Sumit");
		map.put(103,"null");
		map.put(104,"null");
		
	    System.out.println(map);
     }
}



