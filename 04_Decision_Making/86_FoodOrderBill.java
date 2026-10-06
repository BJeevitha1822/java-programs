import java.util.Scanner;

public class FoodOrderBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Pizza - Rs. 250");
        System.out.println("2. Burger - Rs. 150");
        System.out.println("3. Pasta - Rs. 200");
        System.out.println("4. Sandwich - Rs. 100");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double price;

        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
        } else if (choice == 1) {
            price = 250;
            System.out.printf("Total Bill: Rs. %.2f%n", price * quantity);
        } else if (choice == 2) {
            price = 150;
            System.out.printf("Total Bill: Rs. %.2f%n", price * quantity);
        } else if (choice == 3) {
            price = 200;
            System.out.printf("Total Bill: Rs. %.2f%n", price * quantity);
        } else if (choice == 4) {
            price = 100;
            System.out.printf("Total Bill: Rs. %.2f%n", price * quantity);
        } else {
            System.out.println("Invalid food choice.");
        }

        sc.close();
    }
}
