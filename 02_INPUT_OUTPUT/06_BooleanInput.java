import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Student: " + isStudent);

        sc.close();
    }
}
