import java.util.Scanner;

public class UsernameValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        if (username.length() < 5) {
            System.out.println("Username is too short.");
        } else if (username.length() > 15) {
            System.out.println("Username is too long.");
        } else if (username.equals("admin")) {
            System.out.println("Username is reserved.");
        } else {
            System.out.println("Username is valid.");
        }

        sc.close();
    }
}
