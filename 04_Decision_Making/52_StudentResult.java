import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in English: ");
        int english = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();

        if (english >= 50 && maths >= 50 && science >= 50) {

            int total = english + maths + science;
            double average = total / 3.0;

            System.out.println("Result: PASS");
            System.out.println("Total: " + total);
            System.out.printf("Average: %.2f%n", average);

            if (average >= 90) {
                System.out.println("Grade: A");
            } else if (average >= 75) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }

        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}
