package usermgmt.client;

import usermgmt.service.UserService;
import usermgmt.service.impl.UserServiceImpl;
import java.util.Scanner;

public class UserClient {
    public static void main(String[] args) {
        UserService dao = new UserServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1) Register");
            System.out.println("2) Login");
            System.out.println("3) Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    dao.register();
                    break;
                case 2:
                    System.out.print("Enter Username: ");
                    String uname = sc.next();
                    System.out.print("Enter Password: ");
                    String pass = sc.next();

                    boolean isValid = dao.verifyUserNameAndPassword(uname, pass);
                    if (isValid) {
                        System.out.println("Login Successful!\n");
                    } else {
                        System.out.println("Invalid credentials.\n");
                    }
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.\n");
            }
        }
    }
}
