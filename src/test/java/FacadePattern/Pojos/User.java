package FacadePattern.Pojos;

public class User {
    private String name;
    private String lastName;
    private String postCode;

    public User(String name, String lastName, String postCode) {
        this.name = name;
        this.lastName = lastName;
        this.postCode = postCode;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPostCode() {
        return postCode;
    }

    public User setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
}
