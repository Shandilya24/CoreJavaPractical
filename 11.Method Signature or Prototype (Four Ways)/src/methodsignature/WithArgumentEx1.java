package methodsignature;
import java.util.Scanner;

public class WithArgumentEx1 {

    void sum(int no[]) {
        int sum = 0;
        for (int i = 0; i < no.length; i++) {
            sum = sum + no[i];
        }
        System.out.println("Sum of all values = " + sum);
    }

    int pro(int no[]) {
        int pro = 1;
        for (int i = 0; i < no.length; i++) {
            pro = pro * no[i];
        }
        return pro;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 values in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        WithArgumentEx1 withArgumentEx1 = new WithArgumentEx1();
        withArgumentEx1.sum(arr);
        System.out.println("Product of all numbers = " + withArgumentEx1.pro(arr));
    }
}
