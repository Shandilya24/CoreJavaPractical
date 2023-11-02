package methodoverloading;

public class MoEx2{
    void show(int no)
    {
    	System.out.println("show int="+no);
    }
    void show(String no)
    {
    	System.out.println("Show String="+no);
    }
    void show(char no)
    {
    	System.out.println("Show char="+no);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoEx2 m=new MoEx2();
		m.show(20);
		m.show('A');
		m.show("Hello");
	}

}
