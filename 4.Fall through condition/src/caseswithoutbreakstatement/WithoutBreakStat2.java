//case symbol
package caseswithoutbreakstatement;

public class WithoutBreakStat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=10;
		int no2=2;
		int result=0;
		System.out.println("***Select Option***");
		System.out.println("Press + for add");
		System.out.println("Press - for sub");
		
		char Choice='-';
        switch (Choice)
        {
        case '+' : result=no1+no2;
                   System.out.println("add="+result);
        case '-' : result=no1-no2;
        	       System.out.println("sub="+result);
        
        default:System.out.println("Invalid option try again");
                
        
        }
        System.out.println("result="+result);
	}

}

