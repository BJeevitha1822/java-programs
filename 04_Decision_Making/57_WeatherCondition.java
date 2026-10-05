import java.util.Scanner;

public class WeatherCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperature = sc.nextDouble();

        if (temperature >= 35) {
            System.out.println("Weather: Very Hot");
        } else if (temperature >= 25) {
            System.out.println("Weather: Hot");
        } else if (temperature >= 15) {
            System.out.println("Weather: Pleasant");
        } else if (temperature >= 5) {
            System.out.println("Weather: Cold");
        } else {
            System.out.println("Weather: Very Cold");
        }

        sc.close();
    }
}
