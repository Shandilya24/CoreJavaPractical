package constructor;

public class ConsEx2 {
    ConsEx2(int no) {
        System.out.println("Parameterized Constructor " + no);
    }

    public static void main(String[] args) {
        ConsEx2 c1 = new ConsEx2(42); // Use the parameterized constructor with an argument
    }
}
