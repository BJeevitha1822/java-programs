import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("\n--- Relational Operations ---");

        System.out.println("First == Second : " + (first == second));
        System.out.println("First != Second : " + (first != second));
        System.out.println("First > Second  : " + (first > second));
        System.out.println("First < Second  : " + (first < second));
        System.out.println("First >= Second : " + (first >= second));
        System.out.println("First <= Second : " + (first <= second));

        sc.close();
    }
}
