import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double number = input.nextDouble();

        System.out.println("You entered: " + number);

        input.close();
    }
}
