import java.util.Scanner;

public class InputAndFormattedOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\n--- Student Details ---");

        System.out.printf("%-10s : %s%n", "Name", name);
        System.out.printf("%-10s : %d%n", "Age", age);
        System.out.printf("%-10s : %.2f%n", "CGPA", cgpa);

        sc.close();
    }
}
