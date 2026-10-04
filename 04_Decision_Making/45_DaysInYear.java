import java.util.Scanner;

public class DaysInYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year.");
            System.out.println("Number of days: 366");
        } else {
            System.out.println("Not a leap year.");
            System.out.println("Number of days: 365");
        }

        sc.close();
    }
}
