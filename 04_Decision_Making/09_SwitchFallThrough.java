import java.util.Scanner;

public class SwitchFallThrough {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 3: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

            default:
                System.out.println("End of switch.");
        }

        sc.close();
    }
}
