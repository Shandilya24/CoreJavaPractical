package integralliteral;

public class IntegralLiteralEx1 {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
        byte a1=123;//type casting  implict automaticaly
        System.out.println(a1);//123
        //byte=a+1;//CTE-incompatible types:possible lossy conversion float into byte
        //byte b=a+(byte)1;
        byte b =(byte)(a1+1);//typecasting-explict-by parametre
        System.out.println(b);//124
        
        byte c=b++;
        System.out.println(c);//124
        System.out.println(b);//125
        
        
        
        
        
	}

}
