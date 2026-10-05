import java.util.Scanner;

public class HotelRoomCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room type (1-3): ");
        int roomType = sc.nextInt();

        if (roomType == 1) {
            System.out.println("Room: Standard");
            System.out.println("Price: Rs. 1500 per night");
        } else if (roomType == 2) {
            System.out.println("Room: Deluxe");
            System.out.println("Price: Rs. 2500 per night");
        } else if (roomType == 3) {
            System.out.println("Room: Suite");
            System.out.println("Price: Rs. 4000 per night");
        } else {
            System.out.println("Invalid room type.");
        }

        sc.close();
    }
}
