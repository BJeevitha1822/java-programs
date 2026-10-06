import java.util.Scanner;

public class EmployeeExperienceCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years of experience: ");
        double experience = sc.nextDouble();

        if (experience < 0) {
            System.out.println("Invalid experience.");
        } else if (experience < 1) {
            System.out.println("Category: Fresher");
        } else if (experience < 3) {
            System.out.println("Category: Junior");
        } else if (experience < 7) {
            System.out.println("Category: Experienced");
        } else if (experience < 12) {
            System.out.println("Category: Senior");
        } else {
            System.out.println("Category: Expert");
        }

        sc.close();
    }
}
