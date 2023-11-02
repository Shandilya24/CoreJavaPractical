package inheritanceexample;

public class Parents extends Grand {
    static void showParent() {
        System.out.println("Grand");
    }

    public static void main(String[] args) {
        // Code to be executed
        showParent();
    }
}
