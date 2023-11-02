package example2;
import java.util.List;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer>list=new LinkedList<Integer>();
        list.add(10);
        list.add(100);
        list.add(10);
        list.add(null);
        System.out.println(list);
	}

}
