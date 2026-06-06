package reservation;

/**
 * User.java
 * Represents a system user — passenger or admin.
 *
 * @author  Megha Kardam
 * @version 1.0
 */
public class User {

    private String  loginId;
    private String  password;
    private String  fullName;
    private boolean isAdmin;

    public User(String loginId, String password, String fullName, boolean isAdmin) {
        this.loginId  = loginId;
        this.password = password;
        this.fullName = fullName;
        this.isAdmin  = isAdmin;
    }

    public String  getLoginId()  { return loginId; }
    public String  getPassword() { return password; }
    public String  getFullName() { return fullName; }
    public boolean isAdmin()     { return isAdmin; }
}
