import java.util.Scanner;

class PracThree{
    public static void main(String[] args) {
        //task5
            // Student student1 = new Student();
            // student1.input();
            // student1.display();
            // Student student2 = new Student();
            // student2.input();
            // student2.display();
        //task6
            // BankAccount account = new BankAccount();
            
            // account.initialize();
            // account.display();
            // account.deposit(500.00);
            // account.withdraw(200.00);
            // account.withdraw(1500.00);
            // account.display();
        //task7    
            // Scanner scanner = new Scanner(System.in);

            // System.out.print("Enter number of students: ");
            // int numOfStudents = scanner.nextInt();
            // scanner.nextLine();

            // Student[] students = new Student[numOfStudents];

            // for (int i = 0; i < numOfStudents; i++) {
            //     students[i] = new Student(); 
            //     System.out.println("Entering details for student " + (i + 1));
            //     students[i].input(); 
            // }

            // System.out.println("\nStudent Details:\n");
            // for (int i=0; i < numOfStudents; i++) {
            //     students[i].display();
            //     System.out.println(); 
            // }
        //task9
            // Scanner scanner = new Scanner(System.in);
    
            // System.out.print("Enter account holder's name: ");
            // String name = scanner.nextLine();
            
            // System.out.print("Enter account number: ");
            // String accNumber = scanner.nextLine();
            
            // System.out.print("Enter account type (e.g., Savings, Checking): ");
            // String accType = scanner.nextLine();
            
            // System.out.print("Enter initial balance: ");
            // double initialBalance = scanner.nextDouble();

            // BankAccount account = new BankAccount(name, accNumber, accType, initialBalance);
            // account.display();
            // account.deposit(500.00);
            // account.withdraw(200.00);
            // account.withdraw(1500.00);
            // account.display();

        //task10
            ShapeAreaCalculator calculator = new ShapeAreaCalculator();

            double squareArea = calculator.calculateArea(5.0);
            System.out.println("Area of the square: " + squareArea);

            double rectangleArea = calculator.calculateArea(5.0, 3.0);
            System.out.println("Area of the rectangle: " + rectangleArea);

            double circleArea = calculator.calculateArea(4.0, true);
            System.out.println("Area of the circle: " + circleArea);

            double triangleArea = calculator.calculateArea(5.0, 2.0, true);
            System.out.println("Area of the triangle: " + triangleArea);

            
        }
}

class Student{
    String name;
    float rollno;
    float total;

    void input(){
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        rollno = scanner.nextInt();

        System.out.print("Enter total marks: ");
        total = scanner.nextInt();
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Total Marks: " + total);
    }
}

class BankAccount {
    String depositorName;
    String accountNumber;
    String accountType;
    double balance;

    BankAccount(String depositorName, String accountNumber, String accountType, double balance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // public void initialize() {
        // Scanner scanner = new Scanner(System.in);
    
        // System.out.print("Enter account holder's name: ");
        // String name = scanner.nextLine();
        
        // System.out.print("Enter account number: ");
        // String accNumber = scanner.nextLine();
        
        // System.out.print("Enter account type (e.g., Savings, Checking): ");
        // String accType = scanner.nextLine();
        
        // System.out.print("Enter initial balance: ");
        // double initialBalance = scanner.nextDouble();
        
    //     depositorName = name;
    //     accountNumber = accNumber;
    //     accountType = accType;
    //     balance = initialBalance;
    // }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient moni.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + depositorName);
        System.out.println("Balance: " + balance);
    }
}

class ShapeAreaCalculator {

    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double radius, boolean isCircle) {
        return 3.14 * radius * radius;
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}