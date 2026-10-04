import java.util.Scanner;

public class SwitchWithCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a grade (A, B, C, D): ");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;

            case 'B':
                System.out.println("Very Good!");
                break;

            case 'C':
                System.out.println("Good!");
                break;

            case 'D':
                System.out.println("Needs Improvement.");
                break;

            default:
                System.out.println("Invalid grade.");
        }

        sc.close();
    }
}
