package usermgmt.service;

public interface UserService {
    void register();
    boolean verifyUserNameAndPassword(String uname, String pass);
    String forgotPassword(String uname);
}
