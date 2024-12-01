public class ExceptionDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        String invalidNumber = "abc";

        try {
            int number = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
