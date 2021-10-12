package Day3;

import java.util.Scanner;

public class LoginSuccessfulTest {
    public static void main(String[] args) {
        LoginSuccessfulTest isLoginSuccess = new LoginSuccessfulTest();
       /* isLoginSuccess.isLoginSuccessful("admin", "admin");
        isLoginSuccess.isLoginSuccessful("superman", "superman");
        isLoginSuccess.isLoginSuccessful(" ", " ");



       isLoginSuccess = isLoginSuccessful ("admin", "admin");
        System.out.println("Login Success with admin & admin: " + isLoginSuccess);

        isLoginSuccess = isLoginSuccessful ("superman", "superman");
        System.out.println("Login Success with superman & superman: " + isLoginSuccess);

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter username : ");
        String name = scanner.nextLine();

        System.out.println("Please enter a password : ");
        String password = scanner.nextLine();

        isLoginSuccess.isLoginSuccessful(name,password);

    }

    public static void isLoginSuccessful(String username, String password) {
        if (username == null || password == null) {
            System.out.println("Login Success with " + username + " & " + password + ": False");
        }
        if (username == "admin" || password == "admin") {
            System.out.println("Login Success with " + username + " & " + password + ": True");
        }
        else {
            System.out.println("Login Success with " + username + " & " + password + ": False");
        }
    }
}
