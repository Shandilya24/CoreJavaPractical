//Without return type without argument-IPO-void sum()

//Without return type-output statement
package methodsignature;

public class WithoutReturnType1 {

    void sum() {
        int no1 = 10, no2 = 2; // Initialize two numbers
        int add = no1 + no2;  // Calculate the sum
        System.out.println("Addition = " + add); // Print the result
    }

    void sub() {
        int no1 = 10, no2 = 2; // Initialize two numbers
        int sub = no1 - no2;  // Calculate the subtraction
        System.out.println("Subtraction = " + sub); // Print the result
    }

    public static void main(String[] args) {
        WithoutReturnType1 withoutReturnType = new WithoutReturnType1();
        withoutReturnType.sum(); // Call the sum method
        withoutReturnType.sub(); // Call the sub method
    }
}



