import java.util.InputMismatchException;
import java.util.Scanner;

class linear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};
        
        try {
            System.out.println("Enter the element to search for:");
            int target = scanner.nextInt();
            
            boolean found = false;
            int index = -1;
            
            for (int i = 0; i <= array.length; i++) {
                try {
                    if (array[i] == target) {
                        index = i;
                        found = true;
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index out of bounds: " + e.getMessage());
                }
            }
            
            if (found) {
                System.out.println("element found: " + index);
            } else {
                System.out.println("element not found");
            }
        } catch (InputMismatchException e) {
            System.out.println("please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}