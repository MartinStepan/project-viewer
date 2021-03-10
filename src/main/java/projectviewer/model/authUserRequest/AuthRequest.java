package projectviewer.model.authUserRequest;

public class AuthRequest {

    private String userName;
    private String password;
    private String code;

    public AuthRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.code = "string";
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getCode() {
        return code;
    }
}
