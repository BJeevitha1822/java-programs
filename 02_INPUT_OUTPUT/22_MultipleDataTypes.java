public class MultipleDataTypes {
    public static void main(String[] args) {

        String name = "Jeevii";
        int age = 20;
        double cgpa = 8.69;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("--- Student Information ---");

        System.out.printf("Name       : %s%n", name);
        System.out.printf("Age        : %d%n", age);
        System.out.printf("CGPA       : %.2f%n", cgpa);
        System.out.printf("Grade      : %c%n", grade);
        System.out.printf("Is Student : %b%n", isStudent);

    }
}
