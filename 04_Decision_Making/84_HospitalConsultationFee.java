import java.util.Scanner;

public class HospitalConsultationFee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient age: ");
        int age = sc.nextInt();

        System.out.print("Enter consultation fee: ");
        double fee = sc.nextDouble();

        double finalFee;

        if (age < 0 || fee < 0) {
            System.out.println("Invalid input.");
        } else if (age < 5) {
            finalFee = 0;
            System.out.printf("Final consultation fee: Rs. %.2f%n", finalFee);
        } else if (age <= 12) {
            finalFee = fee * 0.50;
            System.out.printf("Final consultation fee: Rs. %.2f%n", finalFee);
        } else if (age >= 60) {
            finalFee = fee * 0.75;
            System.out.printf("Final consultation fee: Rs. %.2f%n", finalFee);
        } else {
            finalFee = fee;
            System.out.printf("Final consultation fee: Rs. %.2f%n", finalFee);
        }

        sc.close();
    }
}
