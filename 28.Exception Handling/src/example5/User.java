//Unchecked exception are checked at run time by JVM.
package example5;

public class User {
    static void show() {
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        show();
    }
}


