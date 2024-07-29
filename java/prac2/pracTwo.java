import java.util.*;
class pracTwo{
    static void marks(double num1,double num2,double num3,double num4,double num5){
        double marks=(num1+num2+num3+num4+num5)/5;
        if (marks>=80){
            System.out.println("A Grade for average marks: "+marks);
        }
        else if (marks<80 && marks >=73){
            System.out.println("B+ Grade for average marks: "+marks);
        }
        else if (marks<73 && marks >=65){
            System.out.println("B Grade for average marks: "+marks);
        }
        else if (marks<65 && marks >=55){
            System.out.println("C Grade for average marks: "+marks);
        }
        else{
            System.out.println("Fail for average marks: "+marks);
        }
    }

    static void ntimes(int n){
        for(int i=0;i<n;i++){
            System.out.println("hello");
        }
    }

    static void table(int n){
        for(int i =1; i<=10;i++){
            System.out.println(n+" x "+i+" = "+ i*n);
        }
    }

    static double fact(double fact){
        if (fact != 0)
        {return (fact*fact(fact-1));}
        else return 1;
    }

    static double seriesone(int n){
        double series=1;
        for(double i=2;i<=n;i++){
            series+=1/i;
        }
        return series;
    }

    static double seriestwo(int n){
        double series=1;
        for(double i=2;i<=n;i++){
            series+=i*i;
        }
        return series;
    }

    static void storingstudentdetails(int[] marks){
        
        double sum1=0;

        System.out.println("\nMarks of the 10 students are:");
        for (int i = 0; i < marks.length; i++) {
            sum1+=marks[i];
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
        double average=sum1/marks.length;
        System.out.println("sum and average: "+sum1+"\t"+average);
    }

    public static void displayMaximumMarks(int[][] marks) {
        int numStudents = marks.length;
        
        int numSubjects = marks[0].length;
        
        System.out.println("\nMaximum marks scored by each student:");
        for (int i = 0; i < numStudents; i++) {
            int maxMarks = marks[i][0];
            for (int j = 1; j < numSubjects; j++) {
                if (marks[i][j] > maxMarks) {
                    maxMarks = marks[i][j];
                }
            }
            System.out.println("Student " + (i + 1) + ": " + maxMarks);
        }
    }

    public static void printHello(int n) {
        int count=1;
        for (int i = 0; i < n; i++) {
            if (count>5) break;
            System.out.println("Hello");
            ++count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter marks of subject one: ");
        // double num1=sc.nextDouble();
        // System.out.print("Enter marks of subject two: ");
        // double num2=sc.nextDouble();
        // System.out.print("Enter marks of subject three: ");
        // double num3=sc.nextDouble();
        // System.out.print("Enter marks of subject three: ");
        // double num4=sc.nextDouble();
        // System.out.print("Enter marks of subject three: ");
        // double num5=sc.nextDouble();

        // marks(num1,num2,num3,num4,num5);

        // System.out.print("Enter the value of n: ");
        // int hello=sc.nextInt();

        // ntimes(hello);

        // System.out.print("Enter the number for which u want the table: ");
        // int table=sc.nextInt();
        // table(table);

        // System.out.print("Enter the number for which u want factorial for: ");
        // int factnum=sc.nextInt();
        // double fact=fact(factnum);
        // System.out.print("fact of number is: "+fact);    
        
        System.out.print("Enter the value of n for series one: ");
        int seri1=sc.nextInt();
        System.out.print(seriesone(seri1));

        System.out.print("\nEnter the value of n for series two: ");
        int seri2=sc.nextInt();
        System.out.print(seriestwo(seri2));

        int[] marks = new int[10];
       
        System.out.println("\nEnter the marks for 10 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("\nEnter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        storingstudentdetails(marks);

    
        int numberOfStudents = 5;
        int numberOfSubjects = 3;

        int[][] marks1 = new int[numberOfStudents][numberOfSubjects];
        
        System.out.println("\nEnter the marks for " + numberOfStudents + " students in " + numberOfSubjects + " subjects:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks1[i][j] = sc.nextInt();
            }
        }

        displayMaximumMarks(marks1);

        System.out.print("Enter the number of times to print 'Hello': ");
        int n = sc.nextInt();

        printHello(n);

    }
}