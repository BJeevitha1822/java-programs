public class FormattedTable {
    public static void main(String[] args) {

        System.out.printf("%-10s %-10s %-10s%n", "Number", "Square", "Cube");

        System.out.printf("%-10d %-10d %-10d%n", 1, 1 * 1, 1 * 1 * 1);
        System.out.printf("%-10d %-10d %-10d%n", 2, 2 * 2, 2 * 2 * 2);
        System.out.printf("%-10d %-10d %-10d%n", 3, 3 * 3, 3 * 3 * 3);
        System.out.printf("%-10d %-10d %-10d%n", 4, 4 * 4, 4 * 4 * 4);
        System.out.printf("%-10d %-10d %-10d%n", 5, 5 * 5, 5 * 5 * 5);

    }
}

/*
OUTPUT  (FORMATTED TABLE     %-10d-->left aligned 10 spaces)
Number     Square     Cube
1          1          1
2          4          8
3          9          27
4          16         64
5          25         125
*/
