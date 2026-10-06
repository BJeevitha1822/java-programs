import java.util.Scanner;

public class GradePointCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade point: ");
        double gradePoint = sc.nextDouble();

        if (gradePoint < 0 || gradePoint > 10) {
            System.out.println("Invalid grade point.");
        } else if (gradePoint >= 9) {
            System.out.println("Category: Outstanding");
        } else if (gradePoint >= 8) {
            System.out.println("Category: Excellent");
        } else if (gradePoint >= 7) {
            System.out.println("Category: Very Good");
        } else if (gradePoint >= 6) {
            System.out.println("Category: Good");
        } else if (gradePoint >= 5) {
            System.out.println("Category: Average");
        } else {
            System.out.println("Category: Needs Improvement");
        }

        sc.close();
    }
}
