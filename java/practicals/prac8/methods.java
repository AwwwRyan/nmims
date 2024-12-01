import java.util.Scanner;

public class methods {

    public static <N extends Number> void performOperation(N num1, N num2, Scanner scanner) {
        System.out.println("Choose an operation: 1. Addition 2. Subtraction");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double sum = num1.doubleValue() + num2.doubleValue();
            System.out.println("Sum: " + sum);
        } else if (choice == 2) {
            double difference = num1.doubleValue() - num2.doubleValue();
            System.out.println("Difference: " + difference);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void performOperation(String str1, String str2, Scanner scanner) {
        System.out.println("Choose an operation: 1. Concatenation 2. Substring check");
        int choice = scanner.nextInt();

        if (choice == 1) {
            String result = str1 + str2;
            System.out.println("Concatenated String: " + result);
        } else if (choice == 2) {
            if (str1.contains(str2)) {
                System.out.println("Substring found: " + str2);
            } else {
                System.out.println("Substring not found.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        performOperation(5, 10, scanner);  // For Number type
        performOperation("hello World", "hello", scanner);  // For String type
        scanner.close();
    }
}
