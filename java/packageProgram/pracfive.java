import person.Teacher;
import company.Manager;

import java.util.Scanner;

public class pracfive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Teacher:");
        System.out.print("Employee Code: ");
        String teacherCode = scanner.nextLine();
        System.out.print("Employee Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Number of Lectures Conducted: ");
        int numberOfLectures = scanner.nextInt();
        System.out.print("Salary per Lecture: ");
        double salaryPerLecture = scanner.nextDouble();
        scanner.nextLine();

        Teacher teacher = new Teacher(teacherCode, teacherName, numberOfLectures, salaryPerLecture);
        teacher.display();

        System.out.println("\nEnter details for Manager:");
        System.out.print("Employee Code: ");
        String managerCode = scanner.nextLine();
        System.out.print("Employee Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        System.out.print("Unit of Sales: ");
        int unitOfSales = scanner.nextInt();

        Manager manager = new Manager(managerCode, managerName, managerSalary, unitOfSales);
        manager.display();
    }
}
