package usermgmt.service.impl;

import usermgmt.service.UserService;
import usermgmt.model.User;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    private User[] users = new User[10];
    private int userCount = 0;
    private Scanner sc = new Scanner(System.in);

    public void register() {
        if (userCount >= users.length) {
            System.out.println("User limit reached. Cannot register more users.");
            return;
        }

        User u = new User();
        u.id = userCount + 1;

        System.out.print("Enter First Name: ");
        u.firstName = sc.next();

        System.out.print("Enter Last Name: ");
        u.lastName = sc.next();

        System.out.print("Enter Email: ");
        u.email = sc.next();

        System.out.print("Enter Username: ");
        u.username = sc.next();

        System.out.print("Enter Password: ");
        u.password = sc.next();

        users[userCount++] = u;
        System.out.println("User registered successfully!\n");
    }

    public boolean verifyUserNameAndPassword(String uname, String pass) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].username.equals(uname) && users[i].password.equals(pass)) {
                return true;
            }
        }
        return false;
    }

    public String forgotPassword(String uname) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].username.equals(uname)) {
                return users[i].password;
            }
        }
        return null;
    }
}
