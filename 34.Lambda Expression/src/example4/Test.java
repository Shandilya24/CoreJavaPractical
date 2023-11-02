//Lambda Expression
package example4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface my=(String msg)->{System.out.println("hello..."+msg);};
	    my.show("Good Evening");
	    //MyInterface my=(message)->{System.out.println("hello..."+message);};
	    //my.show("Good Night");
	    //MyInterface my=message->{System.out.println("hello..."+message);};
	    //my.show("Good Afternoon");
	    //MyInterface my=message->System.out.println("hello..."+message);
	    //my.show("Good Afternoon");
	    
	}
}
