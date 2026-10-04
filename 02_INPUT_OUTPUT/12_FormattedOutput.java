public class FormattedOutput {
    public static void main(String[] args) {

        String name = "Rosy";
        int age = 20;
        double mark = 85.5678;

        System.out.printf("Name  : %-10s%n", name);    //%s → String  %-10s → Prints a String left-aligned within a space of 10 characters.
        System.out.printf("Age   : %d%n", age);       // %d  → Integer      %n  → New line
        System.out.printf("Mark  : %.2f%n", mark);    //%f  → Decimal    %.2f → Decimal with 2 digits

    }
}
