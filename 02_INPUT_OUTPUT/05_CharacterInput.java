import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);    //reads first character-->charAt(0)

        System.out.println("The character is: " + character);

        sc.close();
    }
}
