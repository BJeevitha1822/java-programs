public class PrintfWithWidth {
    public static void main(String[] args) {

        String name = "Jeevii";
        int age = 20;
        double mark = 95.50;

        System.out.printf("%-15s %5d%n", name, age);
        System.out.printf("%-15s %5.2f%n", "Mark", mark);

    }
}
