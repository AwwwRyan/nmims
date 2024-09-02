package person;

public class Teacher extends Employee {
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

