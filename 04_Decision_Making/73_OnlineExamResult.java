import java.util.Scanner;

public class OnlineExamResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total questions: ");
        int totalQuestions = sc.nextInt();

        System.out.print("Enter correct answers: ");
        int correctAnswers = sc.nextInt();

        if (totalQuestions <= 0 || correctAnswers < 0
                || correctAnswers > totalQuestions) {
            System.out.println("Invalid input.");
        } else {

            double percentage =
                    (correctAnswers * 100.0) / totalQuestions;

            if (percentage >= 90) {
                System.out.println("Result: Excellent");
            } else if (percentage >= 75) {
                System.out.println("Result: Very Good");
            } else if (percentage >= 50) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }

            System.out.printf("Percentage: %.2f%%%n", percentage);
        }

        sc.close();
    }
}
