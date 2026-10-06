import java.util.Scanner;

public class ForLoopMultiplicationTableRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            System.out.println("\nTable of " + n);

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }

        sc.close();
    }
}
