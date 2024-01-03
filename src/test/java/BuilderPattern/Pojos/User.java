package BuilderPattern.Pojos;

public class User {
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
