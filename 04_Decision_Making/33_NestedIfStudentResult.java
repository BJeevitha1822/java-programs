import java.util.Scanner;

public class NestedIfStudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 50) {

            if (marks >= 90) {
                System.out.println("Pass with Grade A.");
            } else if (marks >= 75) {
                System.out.println("Pass with Grade B.");
            } else {
                System.out.println("Pass.");
            }

        } else {
            System.out.println("Fail.");
        }

        sc.close();
    }
}
