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

    String username;
    String password;

    public UserBuilder() {

    }

    public User build() {
        return new User(username, password);
    }


}
