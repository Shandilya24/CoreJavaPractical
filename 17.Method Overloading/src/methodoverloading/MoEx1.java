package methodoverloading;

public class MoEx1{
    void add(int no1, int no2)
    {
    	System.out.println(no1+no2);
    }
    void add(int no1, int no2, int no3)
    {
    	System.out.println(no1+no2+no3);
    }
    void add(int no1, int no2,int no3, int no4)
    {
    	System.out.println(no1+no2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoEx1 m=new MoEx1();
		m.add(10,2);
		m.add(10,2,1);
		m.add(10,2,1,3);
	}

}
