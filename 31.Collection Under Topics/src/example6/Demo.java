package example6;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		
		map.put(101,"Amit");
		map.put(102,"Sumit");
		map.put(null,"Sumit");
		map.put(null,"Preeti");
		map.put(103,"null");
		map.put(104,"null");
		
	    System.out.println(map);
     }
}



