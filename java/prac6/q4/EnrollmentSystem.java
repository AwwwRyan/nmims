class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class IneligibleStudentException extends Exception {
    public IneligibleStudentException(String message) {
        super(message);
    }
}

class Course {
    private int capacity;
    private int enrolledStudents;

    public Course(int capacity) {
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    public void enrollStudent(int age) throws CourseFullException, IneligibleStudentException {
        if (age < 20) {
            throw new IneligibleStudentException("Age must be 20 or older.");
        }
        if (enrolledStudents >= capacity) {
            throw new CourseFullException("Course is full");
        }
        enrolledStudents++;
        System.out.println("successfully");
    }
}

// Example usage
public class EnrollmentSystem {
    public static void main(String[] args){
        Course course = new Course(2);

        try {
            course.enrollStudent(19);
        } catch (IneligibleStudentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (CourseFullException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            course.enrollStudent(21);
            course.enrollStudent(22);
            course.enrollStudent(23);
        } catch (IneligibleStudentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (CourseFullException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
