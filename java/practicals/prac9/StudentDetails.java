import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public String getDetails() {
        return "roll No: " + rollNo + ", mame: " + name + ", address: " + address;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter roll no: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            students.add(new Student(rollNo, name, address));

            System.out.print("Do you want to add another student? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y');

        Collections.sort(students, new NameComparator());
        System.out.println("Students sorted by name:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getDetails());
        }

        scanner.close();
    }
}
