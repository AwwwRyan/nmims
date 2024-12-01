import java.util.Scanner;

class pracseven {

    static int counting(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static String concat(String str1, String str2) {
        return str1 + str2;
    }

    static boolean palindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Count occurrences of a character");
            System.out.println("2. Reverse a string");
            System.out.println("3. Concatenate two strings");
            System.out.println("4. Check if a string is a palindrome");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the character to count: ");
                    char ch = scanner.nextLine().charAt(0);
                    int count = counting(str1, ch);
                    System.out.println("Count of '" + ch + "': " + count);
                    break;
                    
                case 2:
                    System.out.print("Enter a string: ");
                    String str2 = scanner.nextLine();
                    String reversed = reverse(str2);
                    System.out.println("Reversed string: " + reversed);
                    break;
                    
                case 3:
                    System.out.print("Enter the first string: ");
                    String str3 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str4 = scanner.nextLine();
                    String concatenated = concat(str3, str4);
                    System.out.println("Concatenated string: " + concatenated);
                    break;
                    
                case 4:
                    System.out.print("Enter a string: ");
                    String str5 = scanner.nextLine();
                    boolean isPalindrome = palindrome(str5);
                    System.out.println("Is the string a palindrome? " + isPalindrome);
                    break;
                    
                case 5:
                    System.out.println("exit");
                    break;
                    
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } 
        while (choice != 5);
        scanner.close();
    }
}
