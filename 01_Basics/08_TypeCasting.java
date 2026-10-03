public class TypeCasting {
    public static void main(String[] args) {

        // Widening casting  (smaller type->larger type)
        int number = 100;
        double decimal = number;

        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + number);
        System.out.println("Double value: " + decimal);

        // Narrowing casting  (larger type->smaller type)
        double value = 25.75;
        int result = (int) value;

        System.out.println("\nNarrowing Casting:");
        System.out.println("Double value: " + value);
        System.out.println("Integer value: " + result);
    }
}
