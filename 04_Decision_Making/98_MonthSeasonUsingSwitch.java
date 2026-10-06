import java.util.Scanner;

public class MonthSeasonUsingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
                System.out.println("Season: Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Season: Summer");
                break;

            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Season: Monsoon");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("Season: Winter");
                break;

            default:
                System.out.println("Invalid month.");
        }

        sc.close();
    }
}
