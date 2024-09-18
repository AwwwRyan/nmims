import java.util.Scanner;

public class methods {

    public static <T> void performOperation(T obj1, T obj2, Scanner scanner) {
        System.out.println("Choose an operation: 1. Addition/Concatenation 2. Subtraction");
        int choice = scanner.nextInt();

        if (choice == 1) {
            if (obj1 instanceof String && obj2 instanceof String) {
                String result = (String) obj1 + (String) obj2;
                System.out.println("Concatenated String: " + result);
            } else if (obj1 instanceof Number && obj2 instanceof Number) {
                double sum = ((Number) obj1).doubleValue() + ((Number) obj2).doubleValue();
                System.out.println("Sum: " + sum);
            }
        } else if (choice == 2) {
            if (obj1 instanceof Number && obj2 instanceof Number) {
                double difference = ((Number) obj1).doubleValue() - ((Number) obj2).doubleValue();
                System.out.println("Difference: " + difference);
            } else if (obj1 instanceof String && obj2 instanceof String) {
                String mainString = (String) obj1;
                String subString = (String) obj2;
                if (mainString.contains(subString)) {
                    System.out.println("Substring found: " + subString);
                } else {
                    System.out.println("Substring not found.");
                }
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        performOperation(5, 10, scanner);
        performOperation("hello World","hello",  scanner);
        scanner.close();
    }
}
