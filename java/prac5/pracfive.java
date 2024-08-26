class Student {
    int rollNumber;
    String name;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    int getRollNumber() {
        return rollNumber;
    }

    String getName() {
        return name;
    }
}

class Test extends Student {
    int mark1;
    int mark2;

    Test(int rollNumber, String name, int mark1, int mark2) {
        super(rollNumber, name);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    int getMark1() {
        return mark1;
    }

    int getMark2() {
        return mark2;
    }
}
class Result extends Test{
    int sportPoint;

    Result(int rollNumber, String name, int mark1, int mark2, int sportPoint) {
        super(rollNumber, name, mark1, mark2);
        this.sportPoint = sportPoint;
    }

    void calculate() {
        int totalMarks = mark1 + mark2 + sportPoint;
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Name: " + getName());
        System.out.println("Marks 1: " + getMark1());
        System.out.println("Marks 2: " + getMark2());
        System.out.println("Total Marks: " + totalMarks);
    }
}
class pracfive{
    public static void main(String[] args) {
        Result result = new Result(101, "John Doe", 85, 90, 10);
        result.calculate();
    }
}