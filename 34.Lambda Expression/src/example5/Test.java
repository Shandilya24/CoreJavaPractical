//Lambda Expression
package example5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface my=(int x,int y)->{return(x+y);};
	    System.out.println(my.sum(10,2));
	    //MyInterface my=(x,y)->{return(x+y);};
	    //System.out.println(my.sum(10,2));
		//MyInterface my=x,y->{return(x+y);};//CTE
	    //System.out.println(my.sum(10,2));
		//MyInterface my=(x,y)->return(x+y);//CTE
	    //System.out.println(my.sum(10,2));
	}
}
