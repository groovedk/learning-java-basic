public class User {

    private String email;
    private String password;
    private String name;

    public User(String email, String name) {
//        this.email = email;
//        this.name = name;
        this(name, email, null);
    }

    public User(String email, String name, String password) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
            "email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
