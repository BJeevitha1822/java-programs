import java.util.Scanner;

public class JobEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your qualification: ");
        String qualification = sc.next();

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();
        
        if (age >= 21 && qualification.equalsIgnoreCase("degree")
                && experience >= 2) {
            System.out.println("Eligible for the job.");
        } else {
            System.out.println("Not eligible for the job.");
        }

        sc.close();
    }
}
