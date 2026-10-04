import java.util.Scanner;

public class TriangleAngleType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();

        System.out.print("Enter second angle: ");
        int b = sc.nextInt();

        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {

            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Right-angled triangle.");
            } else if (a > 90 || b > 90 || c > 90) {
                System.out.println("Obtuse-angled triangle.");
            } else {
                System.out.println("Acute-angled triangle.");
            }

        } else {
            System.out.println("Invalid triangle angles.");
        }

        sc.close();
    }
}
