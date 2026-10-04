import java.util.Scanner;

public class IfElseWithOrOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter your attendance percentage: ");
        int attendance = sc.nextInt();

        if (marks >= 90 || attendance >= 90) {
            System.out.println("Excellent performance.");
        } else {
            System.out.println("Keep improving.");
        }

        sc.close();
    }
}
