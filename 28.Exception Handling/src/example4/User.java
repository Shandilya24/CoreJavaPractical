//Checked exception are checked at compile time by the compiler.
package example4;

public class User {
    static void show() {
        try {
            throw new ClassNotFoundException(); // Creating a new instance of ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("obj");
        }
    }

    public static void main(String[] args) {
        show();
    }
}
