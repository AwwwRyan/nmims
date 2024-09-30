import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add marks");
            System.out.println("2. Display total number of students");
            System.out.println("3. Display marks of a particular student");
            System.out.println("4. Display marks of all students");
            System.out.println("5. Delete marks of a particular student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter marks of student: ");
                    marks.add(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Total number of students: " + marks.size());
                    break;
                case 3:
                    System.out.print("Enter student index");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < marks.size()) {
                        System.out.println("Marks of student " + index + ": " + marks.get(index));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println("Marks of all students: " + marks);
                    break;
                case 5:
                    System.out.print("Enter student index");
                    int deleteIndex = scanner.nextInt();
                    if (deleteIndex >= 0 && deleteIndex < marks.size()) {
                        marks.remove(deleteIndex);
                        System.out.println("Marks deleted for student " + deleteIndex);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
        scanner.close();
    }
}