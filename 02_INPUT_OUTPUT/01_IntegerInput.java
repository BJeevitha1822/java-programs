import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("The number is: " + number);

        sc.close();
    }
}
