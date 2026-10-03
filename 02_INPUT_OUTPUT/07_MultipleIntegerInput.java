import java.util.Scanner;

public class MultipleIntegerInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
        System.out.println("Third number: " + third);

        sc.close();
    }
}
