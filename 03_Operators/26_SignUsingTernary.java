import java.util.Scanner;

public class SignUsingTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sign = (number > 0) ? 1
                  : (number < 0) ? -1
                  : 0;

        System.out.println("\n--- Sign of Number ---");
        System.out.println("Sign: " + sign);

        sc.close();
    }
}
