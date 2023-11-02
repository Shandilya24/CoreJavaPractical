package example7;
import java.sql.SQLException;

public class User {
    static void A() throws SQLException {
        throw new SQLException();
    }
    
    static void B() throws SQLException {
        throw new SQLException();
    }
    
    static void C() throws SQLException {
        throw new SQLException();
    }

    public static void main(String[] args) {
        try {
            C(); // Corrected method name from c() to C()
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
