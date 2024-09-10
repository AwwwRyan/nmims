import java.util.Arrays;
import java.util.Scanner;

class StringOperations {
    private StringBuffer str;

    public StringOperations(String str) {
        this.str = new StringBuffer(str);
    }

    public boolean compareStrings(String otherStr) {
        return str.toString().equals(otherStr);
    }

    public boolean isPalindrome() {
        String original = str.toString();
        String reversed = str.reverse().toString();
        str.reverse(); 
        return original.equals(reversed);
    }

    public int countOccurrences(String substring) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    public void replaceSubstring(String oldSubstring, String newSubstring) {
        int index;
        while ((index = str.indexOf(oldSubstring)) != -1) {
            str.replace(index, index + oldSubstring.length(), newSubstring);
        }
    }

    public void appendString(String appendStr) {
        str.append(appendStr);
    }

    public void insertStringAt(int position, String insertStr) {
        if (position >= 0 && position <= str.length()) {
            str.insert(position, insertStr);
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void deleteSubstring(String delStr) {
        int index;
        while ((index = str.indexOf(delStr)) != -1) {
            str.delete(index, index + delStr.length());
        }
    }

    public static void sortStrings(String[] strings) {
        Arrays.sort(strings);
    }

    public String getString() {
        return str.toString();
    }
}

public class buff {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial string: ");
        String initialStr = scanner.nextLine();

        StringOperations strOps = new StringOperations(initialStr);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Compare two strings");
            System.out.println("2. Check if the string is palindrome");
            System.out.println("3. Find number of occurrences of a substring");
            System.out.println("4. Replace a substring");
            System.out.println("5. Append a new string");
            System.out.println("6. Insert a new string at a position");
            System.out.println("7. Delete a substring");
            System.out.println("8. Sort 4 strings");
            System.out.println("9. Display current string");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the string to compare: ");
                    String compareStr = scanner.nextLine();
                    if (strOps.compareStrings(compareStr)) {
                        System.out.println("Strings are equal.");
                    } else {
                        System.out.println("Strings are not equal.");
                    }
                    break;
                case 2:
                    if (strOps.isPalindrome()) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the substring to find: ");
                    String substring = scanner.nextLine();
                    int occurrences = strOps.countOccurrences(substring);
                    System.out.println("Occurrences: " + occurrences);
                    break;
                case 4:
                    System.out.print("Enter the substring to replace: ");
                    String oldSubstring = scanner.nextLine();
                    System.out.print("Enter the new substring: ");
                    String newSubstring = scanner.nextLine();
                    strOps.replaceSubstring(oldSubstring, newSubstring);
                    System.out.println("Updated string: " + strOps.getString());
                    break;
                case 5:
                    System.out.print("Enter the string to append: ");
                    String appendStr = scanner.nextLine();
                    strOps.appendString(appendStr);
                    System.out.println("Updated string: " + strOps.getString());
                    break;
                case 6:
                    System.out.print("Enter the string to insert: ");
                    String insertStr = scanner.nextLine();
                    System.out.print("Enter the position to insert at: ");
                    int position = scanner.nextInt();
                    scanner.nextLine(); 
                    strOps.insertStringAt(position, insertStr);
                    System.out.println("Updated string: " + strOps.getString());
                    break;
                case 7:
                    System.out.print("Enter the substring to delete: ");
                    String delStr = scanner.nextLine();
                    strOps.deleteSubstring(delStr);
                    System.out.println("Updated string: " + strOps.getString());
                    break;
                case 8:
                    String[] strings = new String[4];
                    for (int i = 0; i < 4; i++) {
                        System.out.print("Enter string " + (i + 1) + ": ");
                        strings[i] = scanner.nextLine();
                    }
                    StringOperations.sortStrings(strings);
                    System.out.println("Sorted strings:");
                    for (String s : strings) {
                        System.out.println(s);
                    }
                    break;
                case 9:
                    System.out.println("Current string: " + strOps.getString());
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 10);

        scanner.close();
    }
}
