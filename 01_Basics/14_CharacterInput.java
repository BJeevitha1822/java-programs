import java.util.Scanner;
public class CharacterInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);      //input->reads a word

        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);     //.charAt(0) → takes the first character    char → stores a single character.

        System.out.println("You entered: " + character);

        input.close();
    }
}
