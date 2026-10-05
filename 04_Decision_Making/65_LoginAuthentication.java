import java.util.Scanner;

public class LoginAuthentication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful.");
        } else if (!username.equals("admin")) {
            System.out.println("Invalid username.");
        } else {
            System.out.println("Invalid password.");
        }

        sc.close();
    }
}
