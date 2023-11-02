package methodsignature;

import java.util.Scanner;

public class WithReturntType2 {
    public void sum(int n1, int n2) {
        int res = n1 + n2;
        System.out.println("Addition = " + res);
    }

    public void sub(int no1, int no2) {
        int resu = no1 - no2;
        System.out.println("Subtraction = " + resu);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int no1 = input.nextInt();
        System.out.print("Enter Second number: ");
        int no2 = input.nextInt();

        WithReturntType2 withReturnType = new WithReturntType2();
        withReturnType.sum(no1, no2);
        withReturnType.sub(no1, no2);
    }
}
