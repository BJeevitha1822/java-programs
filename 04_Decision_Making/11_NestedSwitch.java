import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter category (1-Fruit, 2-Drink): ");
        int category = sc.nextInt();

        switch (category) {

            case 1:
                System.out.print("Enter fruit (1-Apple, 2-Mango): ");
                int fruit = sc.nextInt();

                switch (fruit) {
                    case 1:
                        System.out.println("You selected Apple.");
                        break;

                    case 2:
                        System.out.println("You selected Mango.");
                        break;

                    default:
                        System.out.println("Invalid fruit.");
                }
                break;

            case 2:
                System.out.print("Enter drink (1-Tea, 2-Coffee): ");
                int drink = sc.nextInt();

                switch (drink) {
                    case 1:
                        System.out.println("You selected Tea.");
                        break;

                    case 2:
                        System.out.println("You selected Coffee.");
                        break;

                    default:
                        System.out.println("Invalid drink.");
                }
                break;

            default:
                System.out.println("Invalid category.");
        }

        sc.close();
    }
}
