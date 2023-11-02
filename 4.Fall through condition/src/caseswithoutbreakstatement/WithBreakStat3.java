//case character
package caseswithoutbreakstatement;

public class WithBreakStat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String dept="accounts";
        switch(dept)
        {
        case "sales":System.out.println("10% Salary Increament");
                     break;
        case "accounts":System.out.println("15% Salary Increament");
                     break;
        default:System.out.println("15% Salary Increament");      
        }
	}

}
