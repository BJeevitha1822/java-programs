import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();

        double bonus;

        if (experience >= 10) {
            bonus = salary * 0.20;
        } else if (experience >= 5) {
            bonus = salary * 0.10;
        } else if (experience >= 2) {
            bonus = salary * 0.05;
        } else {
            bonus = 0;
        }

        double finalSalary = salary + bonus;      

        System.out.printf("Bonus: %.2f%n", bonus);
        System.out.printf("Final salary: %.2f%n", finalSalary);

        sc.close();
    }
}
