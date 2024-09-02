package company;
import person.Employee;

public class Manager extends Employee {
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
