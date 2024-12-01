import java.util.Scanner;

public class StringOperations {

    public boolean comparing(StringBuffer str1, StringBuffer str2) {
        if(str1.toString().equals(str2.toString())){
            return true;
        }
        else{return false;}
    }

    public boolean palin(StringBuffer str) {
        String original = str.toString();
        String reversed = new StringBuffer(original).reverse().toString();
        return original.equals(reversed);
    }

    public int countOccurrences(StringBuffer str, String substring) {
        String mainString = str.toString();
        int count = 0;
        int i = 0;
        
        while ((i = mainString.indexOf(substring, i)) != -1) {
            count++;
            i += substring.length();
        }
        return count;
    }

    public StringBuffer replaceSubstring(StringBuffer str, String oldSub, String newSub) {
        return new StringBuffer(str.toString().replace(oldSub, newSub));
    }

    public StringBuffer appendString(StringBuffer str, String toAppend) {
        return str.append(toAppend);
    }

    public StringBuffer inserting(StringBuffer str, String toInsert, int position) {
        return str.insert(position, toInsert);
    }

    public StringBuffer deleteSubstring(StringBuffer str, String toDelete) {
        int start = str.indexOf(toDelete);
        if (start != -1) {
            str.delete(start, start + toDelete.length());
        }
        return str;
    }

    public void sorting(String str1, String str2, String str3, String str4) {
        String first, second, third, fourth;

        if (str1.compareTo(str2) < 0) {
            if (str1.compareTo(str3) < 0) {
                if (str1.compareTo(str4) < 0) {
                    first = str1;
                    if (str2.compareTo(str3) < 0) {
                        if (str2.compareTo(str4) < 0) {
                            second = str2;
                            if (str3.compareTo(str4) < 0) {
                                third = str3;
                                fourth = str4;
                            } else {
                                third = str4;
                                fourth = str3;
                            }
                        } else {
                            second = str4;
                            third = str2;
                            fourth = str3;
                        }
                    } else {
                        if (str3.compareTo(str4) < 0) {
                            second = str3;
                            if (str2.compareTo(str4) < 0) {
                                third = str2;
                                fourth = str4;
                            } else {
                                third = str4;
                                fourth = str2;
                            }
                        } else {
                            second = str4;
                            third = str3;
                            fourth = str2;
                        }
                    }
                } else {
                    first = str4;
                    second = str1;
                    if (str2.compareTo(str3) < 0) {
                        third = str2;
                        fourth = str3;
                    } else {
                        third = str3;
                        fourth = str2;
                    }
                }
            } else {
                if (str3.compareTo(str4) < 0) {
                    first = str3;
                    if (str1.compareTo(str4) < 0) {
                        second = str1;
                        third = str2;
                        fourth = str4;
                    } else {
                        second = str4;
                        third = str1;
                        fourth = str2;
                    }
                } else {
                    first = str4;
                    second = str3;
                    third = str1;
                    fourth = str2;
                }
            }
        } else {
            if (str2.compareTo(str3) < 0) {
                if (str2.compareTo(str4) < 0) {
                    first = str2;
                    if (str1.compareTo(str3) < 0) {
                        if (str1.compareTo(str4) < 0) {
                            second = str1;
                            third = str3;
                            fourth = str4;
                        } else {
                            second = str4;
                            third = str1;
                            fourth = str3;
                        }
                    } else {
                        if (str3.compareTo(str4) < 0) {
                            second = str3;
                            if (str1.compareTo(str4) < 0) {
                                third = str1;
                                fourth = str4;
                            } else {
                                third = str4;
                                fourth = str1;
                            }
                        } else {
                            second = str4;
                            third = str3;
                            fourth = str1;
                        }
                    }
                } else {
                    first = str4;
                    second = str2;
                    if (str1.compareTo(str3) < 0) {
                        third = str1;
                        fourth = str3;
                    } else {
                        third = str3;
                        fourth = str1;
                    }
                }
            } else {
                if (str3.compareTo(str4) < 0) {
                    first = str3;
                    if (str2.compareTo(str4) < 0) {
                        second = str2;
                        third = str1;
                        fourth = str4;
                    } else {
                        second = str4;
                        third = str2;
                        fourth = str1;
                    }
                } else {
                    first = str4;
                    second = str3;
                    third = str2;
                    fourth = str1;
                }
            }
        }

        System.out.println("Strings after sorting:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringOperations operations = new StringOperations();
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Compare two strings");
            System.out.println("2. Check if a string is a palindrome");
            System.out.println("3. Count occurrences of a substring");
            System.out.println("4. Replace a substring");
            System.out.println("5. Append a string");
            System.out.println("6. Insert a string at a position");
            System.out.println("7. Delete a substring");
            System.out.println("8. Sort 4 strings");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter first string: ");
                    str1 = new StringBuffer(scanner.nextLine());
                    System.out.print("Enter second string: ");
                    str2 = new StringBuffer(scanner.nextLine());
                    boolean areEqual = operations.comparing(str1, str2);
                    System.out.println("Strings are " + (areEqual ? "equal" : "not equal"));
                    break;

                case 2:
                    System.out.print("Enter string: ");
                    str1 = new StringBuffer(scanner.nextLine());
                    boolean palin = operations.palin(str1);
                    System.out.println("String is " + (palin ? "a palindrome" : "not a palindrome"));
                    break;

                case 3:
                    System.out.print("Enter main string: ");
                    str1 = new StringBuffer(scanner.nextLine());
                    System.out.print("Enter substring to find: ");
                    String substring = scanner.nextLine();
                    int occurrences = operations.countOccurrences(str1, substring);
                    System.out.println("Number of occurrences: " + occurrences);
                    break;

                case 4:
                    System.out.print("Enter main string: ");
                    str1 = new StringBuffer(scanner.nextLine());
                    System.out.print("Enter substring to replace: ");
                    String oldSub = scanner.nextLine();
                    System.out.print("Enter new substring: ");
                    String newSub = scanner.nextLine();
                    StringBuffer replacedStr = operations.replaceSubstring(str1, oldSub, newSub);
                    System.out.println("String after replacement: " + replacedStr);
                    break;

                case 5:
                    System.out.print("Enter main string: ");
                    str1 = new StringBuffer(scanner.nextLine());
                    System.out.print("Enter string to append: ");
                    String toAppend = scanner.nextLine();
                    StringBuffer appendedStr = operations.appendString(str1, toAppend);
                    System.out.println("String after appending: " + appendedStr);
                    break;

                case 6:
                    System.out.print("Enter main string: ");
                    str1 = new StringBuffer(scanner.nextLine());
                    System.out.print("Enter string to insert: ");
                    String toInsert = scanner.nextLine();
                    System.out.print("Enter position to insert at: ");
                    int position = scanner.nextInt();
                    StringBuffer insertedStr = operations.inserting(str1, toInsert, position);
                    System.out.println("String after insertion: " + insertedStr);
                    break;

                case 7:
                    System.out.print("Enter main string: ");
                    str1 = new StringBuffer(scanner.nextLine());
                    System.out.print("Enter substring to delete: ");
                    String toDelete = scanner.nextLine();
                    StringBuffer deletedStr = operations.deleteSubstring(str1, toDelete);
                    System.out.println("String after deletion: " + deletedStr);
                    break;

                case 8:
                System.out.print("Enter first string: ");
                String string1 = scanner.nextLine();
                System.out.print("Enter second string: ");
                String string2 = scanner.nextLine();
                System.out.print("Enter third string: ");
                String string3 = scanner.nextLine();
                System.out.print("Enter fourth string: ");
                String string4 = scanner.nextLine();
                operations.sorting(string1, string2, string3, string4);
                break;

                case 9:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}
