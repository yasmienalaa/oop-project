import java.util.*;

public class Person {

    protected String username;
    protected String password;

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Person Login(String username, String password, String role, List<Person> users) {
        for (Person u : users) {
            if (u.username.equals(username) &&
                    u.password.equals(password) &&
                    u.getRole().equals(role)) {
                return u;
            }
        }
        return null;
    }

    protected String getRole() {
        return "";
    }
}
