import java.util.*;
class person{
    String name;
    int age;

    person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void getDetails(){}
    void displayDetails(){}
}

class student extends person{
    String studentId;
    String major;

    public student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = scanner.nextLine();
        System.out.print("Enter student's age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student's ID: ");
        studentId = scanner.nextLine();
        System.out.print("Enter student's major: ");
        major = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}

class uni{
    public static void main(String[] args){
        student stud= new student("aryan", 0, "sds", "dsd");
        stud.getDetails();
        stud.displayDetails();
    }
}