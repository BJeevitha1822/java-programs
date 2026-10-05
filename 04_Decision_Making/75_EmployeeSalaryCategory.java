import java.util.Scanner;

public class EmployeeSalaryCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        if (salary < 0) {
            System.out.println("Invalid salary.");
        } else if (salary >= 100000) {
            System.out.println("Salary Category: Very High");
        } else if (salary >= 70000) {
            System.out.println("Salary Category: High");
        } else if (salary >= 40000) {
            System.out.println("Salary Category: Medium");
        } else {
            System.out.println("Salary Category: Low");
        }

        sc.close();
    }
}
