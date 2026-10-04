import java.util.Scanner;

public class AverageWithFormattedOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter mark 2: ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter mark 3: ");
        double mark3 = sc.nextDouble();

        double total = mark1 + mark2 + mark3;
        double average = total / 3;

        System.out.println("\n--- Marks Details ---");
        System.out.printf("%-10s : %.2f%n", "Mark 1", mark1);
        System.out.printf("%-10s : %.2f%n", "Mark 2", mark2);
        System.out.printf("%-10s : %.2f%n", "Mark 3", mark3);
        System.out.printf("%-10s : %.2f%n", "Total", total);
        System.out.printf("%-10s : %.2f%n", "Average", average);

        sc.close();
    }
}
