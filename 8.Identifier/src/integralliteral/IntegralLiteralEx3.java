package integralliteral;

public class IntegralLiteralEx3 {

    public static void main(String[] a) {
        // Variable names should be unique
        int x = 'a'; // Implicit type casting
        System.out.println(x); // 97
        
        char b = 'a';
        char c = 'A';
        int d = b + c; // Implicit type casting
        System.out.println(d); // 97 + 65
    }
}
