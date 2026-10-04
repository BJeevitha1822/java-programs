import java.util.Scanner;

public class EvenOddUsingTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("\n--- Even or Odd ---");
        System.out.println("Number is: " + result);

        sc.close();
    }
}
