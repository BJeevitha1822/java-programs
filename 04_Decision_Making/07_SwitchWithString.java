import java.util.Scanner;

public class SwitchWithString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a programming language: ");
        String language = sc.nextLine();

        switch (language) {
            case "Java":
                System.out.println("Java is an object-oriented programming language.");
                break;

            case "Python":
                System.out.println("Python is a beginner-friendly programming language.");
                break;

            case "C":
                System.out.println("C is a procedural programming language.");
                break;

            case "JavaScript":
                System.out.println("JavaScript is widely used for web development.");
                break;

            default:
                System.out.println("Language not found.");
        }

        sc.close();
    }
}
