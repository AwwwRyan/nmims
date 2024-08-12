import java.util.*;

class Employee {
    String code;
    String name;

    public Employee(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Code: " + code);
        System.out.println("Employee Name: " + name);
    }
}

class Teacher extends Employee {
    int numberOfLectures;
    double salaryPerLecture;

    public Teacher(String code, String name, int numberOfLectures, double salaryPerLecture) {
        super(code, name);
        this.numberOfLectures = numberOfLectures;
        this.salaryPerLecture = salaryPerLecture;
    }

    public double calculate() {
        return numberOfLectures * salaryPerLecture;
    }

    public void display() {
        super.display();
        System.out.println("Number of Lectures: " + numberOfLectures);
        System.out.println("Salary per Lecture: " + salaryPerLecture);
        System.out.println("Total Salary: " + calculate());
    }
}

class Manager extends Employee {
    double salary;
    int unitOfSales;

    public Manager(String code, String name, double salary, int unitOfSales) {
        super(code, name);
        this.salary = salary;
        this.unitOfSales = unitOfSales;
    }

    public double calculate() {
        double bonus;
        if (unitOfSales < 100) {
            bonus = 0.10 * salary;
        } else if (unitOfSales >= 100 && unitOfSales < 200) {
            bonus = 0.15 * salary;
        } else {
            bonus = 0.20 * salary;
        }
        return bonus;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Unit of Sales: " + unitOfSales);
        System.out.println("Bonus: " + calculate());
    }
}

abstract class Figure{
    double dim1;
    double dim2;

    Figure(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    
    abstract double calculateArea();
}

class Circle extends Figure{
    Circle(double radius){
        super(radius,0);
    }

    double calculateArea(){
        return 3.14*dim1*dim1;
    }
}

class rectangle extends Figure{
    rectangle(double length,double breath){
        super(length,breath);
    }

    double calculateArea(){
        return dim1*dim2;
    }
}

class square extends Figure{
    square(double side){
        super(side,side);
    }

    double calculateArea(){
        return dim1*dim2;
    }
}

class pracfour{
    public static void main(String agr[]){
        Scanner scanner = new Scanner(System.in);

        // Circle cir = new Circle(5.0);
        // System.out.println(cir.calculateArea());

        // rectangle rec = new rectangle(5.0,2.0);
        // System.out.println(rec.calculateArea());

        // square sq = new square(5.0);
        // System.out.println(sq.calculateArea());

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