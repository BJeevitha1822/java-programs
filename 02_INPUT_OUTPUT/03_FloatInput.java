import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal value: ");
        float number = sc.nextFloat();

        System.out.println("The value is: " + number);

        sc.close();
    }
}
