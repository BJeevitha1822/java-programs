import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {

            if (a == b && b == c) {
                System.out.println("Equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles triangle.");
            } else {
                System.out.println("Scalene triangle.");
            }

        } else {
            System.out.println("Invalid triangle.");
        }

        sc.close();
    }
}
