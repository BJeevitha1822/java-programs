import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.next();

        int length = password.length();

        if (length < 6) {
            System.out.println("Password strength: Weak");
        } else if (length < 10) {
            System.out.println("Password strength: Medium");
        } else {
            System.out.println("Password strength: Strong");
        }

        sc.close();
    }
}
