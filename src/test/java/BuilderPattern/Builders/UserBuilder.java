package BuilderPattern.Builders;

import BuilderPattern.Pojos.User;

public class UserBuilder {

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    private String username;
    private String password;

    public UserBuilder() {

    }

    public User build() {
        return new User(username, password);
    }


}
