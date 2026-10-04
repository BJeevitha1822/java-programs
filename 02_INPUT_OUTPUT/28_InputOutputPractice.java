import java.util.Scanner;

public class InputOutputPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\n--- Student Information ---");

        System.out.printf("%-15s : %s%n", "Name", name);
        System.out.printf("%-15s : %d years%n", "Age", age);
        System.out.printf("%-15s : %.2f cm%n", "Height", height);
        System.out.printf("%-15s : %.2f%%%n", "Percentage", percentage);    // %% prints %  and %n - new line

        sc.close();
    }
}
