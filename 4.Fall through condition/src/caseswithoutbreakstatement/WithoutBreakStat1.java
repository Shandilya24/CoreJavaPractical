//case integer
package caseswithoutbreakstatement;

public class WithoutBreakStat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=10;
		int no2=2;
		int result=0;
		System.out.println("***Select Option***");
		System.out.println("Press 1 for add");
		System.out.println("Press 2 for sub");
		System.out.println("Press 3 for exit");
		int Choice=20;
        switch (Choice)
        {
        case 1:result=no1+no2;
               System.out.println("add="+result);
        case 2:result=no1-no2;
        	   System.out.println("sub="+result);
        case 3:System.out.println("User quit app");
        
        default:System.out.println("Invalid option try again");
                
        
        }
	}

}
