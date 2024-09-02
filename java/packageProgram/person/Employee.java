package person;

public class Employee {
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
