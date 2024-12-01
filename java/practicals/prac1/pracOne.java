import java.util.Scanner;

class taskOne {
    static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }
}

class taskTwo {
    static double calculateSalvageValue(double purchasePrice, int yearsOfService, double annualDepreciation) {
        double salvageValue = purchasePrice - (annualDepreciation * yearsOfService);
        return salvageValue;
    }
}

class taskThree {
    static double calculateDistance(double acceleration, double initialVelocity, double time) {
        double distance = (initialVelocity * time) + ((acceleration * time * time) / 2);
        return distance;
    }
}

class taskFour {
    static int rev;

    static int reverse(int num) {
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
class taskFive {
    static double calculateTotal(double math, double english, double cs, double physics, double chem) {
        double total = math + english + cs + physics + chem;
        return total;
    }

    static double calculateAverage(double math, double english, double cs, double physics, double chem) {
        double total = calculateTotal(math, english, cs, physics, chem);
        return total/5;
    }
}

class taskSix {
    static double calculator(double num1, double num2, int choice) {
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN;
                }
            default:
                return Double.NaN;
        }
    }
}

class taskSeven {
    static void swapper(double num1, double num2) {
        System.out.println("before swapping: " + num1 + " and " + num2);
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swapping: " + num1 + " and " + num2);
    }
}

class taskEight {
    static String oddOrEven(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}

class taskNine {
    static double largest(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}

class taskTen {
    static void positiveOrNot(double num) {
        if (num < 0) {
            System.out.println("negative");
        } else if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }
}

class taskEleven {
    static boolean boolVariable(boolean num1, boolean num2, boolean num3) {
        int count = 0;
        if (num1 == true) {
            count++;
        }
        if (num2 == true) {
            count++;
        }
        if (num3 == true) {
            count++;
        }

        return count == 2;
    }
}

class taskTwelve {
    public static void consonantVowel(char ch1) {
        char ch = Character.toLowerCase(ch1);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch1 + " is not a character.");
        }
    }
}

class taskThirteen {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}

class taskFourteen {
    static double futureAmount(double principal, double roi, double year) {
        return principal * roi * year;
    }
}

class pracOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // task one
        System.out.print("Enter first number to be added: ");
        int a = sc.nextInt();
        System.out.print("Enter second number to be added: ");
        int b = sc.nextInt();
        System.out.println("sum of " + a + " and " + b + ": " + taskOne.sumOfTwoNumbers(a, b));

        // task two
        System.out.print("\nEnter Purchase price: ");
        double purchasePrice = sc.nextDouble();
        System.out.print("Enter year of service: ");
        int yearsOfService = sc.nextInt();
        System.out.print("Enter annual depreciation: ");
        double annualDepreciation = sc.nextDouble();

        System.out.println("Salvage Value: " + taskTwo.calculateSalvageValue(purchasePrice, yearsOfService, annualDepreciation));

        // task three
        System.out.print("\nEnter acceleration: ");
        double acceleration = sc.nextDouble();
        System.out.print("Enter initial velocity: ");
        double initialVelocity = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        System.out.println("Distance: " + taskThree.calculateDistance(acceleration, initialVelocity, time));

        // task four
        System.out.print("\nEnter a number to be reversed: ");
        int revnum = sc.nextInt();
        System.out.println("Reverse number: " + taskFour.reverse(revnum));

        // task five
        System.out.print("\nEnter 5 scores to calculate total and average: ");
        int math = sc.nextInt();
        int english = sc.nextInt();
        int cs = sc.nextInt();
        int physics = sc.nextInt();
        int chem = sc.nextInt();
        double total=taskFive.calculateTotal(math, english, cs, physics, chem);
        double average = taskFive.calculateAverage(math, english, cs, physics, chem);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        // task six
        System.out.print("\nEnter first number for calculator: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number for calculator: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter choice (1. Add, 2. Subtract, 3. Multiply, 4. Divide): ");
        int choice = sc.nextInt();

        double result = taskSix.calculator(num1, num2, choice);
        if (Double.isNaN(result)) {
            System.out.println("Invalid operation or division by zero.");
        } else {
            System.out.println("Result: " + result);
        }

        // task seven
        System.out.print("\nEnter first number to swap: ");
        double num3 = sc.nextDouble();
        System.out.print("Enter second number to swap: ");
        double num4 = sc.nextDouble();

        taskSeven.swapper(num3, num4);

        // task eight
        System.out.print("\nEnter a number to check odd or even: ");
        int num5 = sc.nextInt();

        System.out.println("Odd or Even: " + taskEight.oddOrEven(num5));

        // task nine
        System.out.print("\nEnter three numbers to find the largest: ");
        double num6 = sc.nextDouble();
        double num7 = sc.nextDouble();
        double num8 = sc.nextDouble();

        System.out.println("Largest number: " + taskNine.largest(num6, num7, num8));

        // task ten
        System.out.print("\nEnter a number to check if positive or negative: ");
        double num9 = sc.nextDouble();
        taskTen.positiveOrNot(num9);

        // task eleven
        System.out.print("\nEnter three boolean values to check if exactly two are true (true/false): ");
        boolean bool1 = sc.nextBoolean();
        boolean bool2 = sc.nextBoolean();
        boolean bool3 = sc.nextBoolean();

        System.out.println("Are exactly two numbers true: " + taskEleven.boolVariable(bool1, bool2, bool3));

        // task twelve
        System.out.print("\nEnter a character to check if vowel or consonant: ");
        char ch = sc.next().charAt(0);

        taskTwelve.consonantVowel(ch);

        // task thirteen
        System.out.print("\nEnter a year to check if leap year: ");
        int year = sc.nextInt();
        System.out.println("Is leap year: " + taskThirteen.isLeapYear(year));

        // task fourteen
        System.out.print("\nEnter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double roi = sc.nextDouble();
        System.out.print("Enter number of years: ");
        double years = sc.nextDouble();
        
        System.out.println("Future amount: " + taskFourteen.futureAmount(principal, roi, years));

    }
}
