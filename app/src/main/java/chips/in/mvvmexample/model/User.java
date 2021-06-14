package chips.in.mvvmexample.model;

public class User {

    private String email;
    private String passwod;
    public String emailhint;
    public String passwordhint;

    public User(String emailhint, String passwordhint) {
        this.emailhint = emailhint;
        this.passwordhint = passwordhint;
    }
}
