package example8;

public class User extends Exception {
    public User() {
        super("Invalid Age Exception");
    }

    static void checkAge() throws User {
        int age = 45;
        if (age > 21 && age < 40) {
            System.out.println("Valid Age");
        } else {
            throw new User();
        }
    }

    public static void main(String[] args) {
        try {
            checkAge();
        } catch (User e) {
            System.out.println(e.getMessage());
        }
    }
}
