package methodsignature;

import java.util.Scanner;

public class WithArgument4 {
    int sum(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }

    String sub(int n1, int n2) {
        return "Subtraction = " + (n1 - n2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int no1 = input.nextInt();
        System.out.print("Enter second no: ");
        int no2 = input.nextInt();

        WithArgument4 withArgument4 = new WithArgument4();
        int res = withArgument4.sum(no1, no2);
        System.out.println("Addition = " + res);
        System.out.println(withArgument4.sub(no1, no2));
    }
}
