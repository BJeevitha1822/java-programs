import java.util.Scanner;

public class PositiveNegativeUsingTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String result = (number > 0) ? "Positive"
                       : (number < 0) ? "Negative"
                       : "Zero";
      
        System.out.println("\n--- Number Check ---");
        System.out.println("Number is: " + result);

        sc.close();
    }
}
