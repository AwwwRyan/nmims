import java.util.*;

class taskOne{
        static int sumOfTwoNumbers(int a,int b){
            return a+b; 
        };
}

class taskTwo{
    static double calculateSalvageValue(double purchasePrice, int yearsOfService, double annualDepreciation) {
        double salvageValue = purchasePrice - (annualDepreciation * yearsOfService);
        return salvageValue;
    }
}

class taskThree{
    static double calculateDistance(double acceleration, double initialVelocity, double time){
        double distance= (initialVelocity*time) + ((acceleration*time*time)/2);
        return distance;
    }
}

class taskFour {
    static int num = 234;
    static int rev;

    static int reverse() {
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}

class taskFive{
    static double calculateTotal(double math,double english,double cs,double physics,double chem){
        double total= math+english+cs+physics+chem;
        return total;
    }
    static double calculateAverage(double math,double english,double cs,double physics,double chem){
        double average= (math+english+cs+physics+chem)/5;
        return average;
    }
}

class taskSix{
    static double calculator(double num1,double num2,int choice){
        double result;
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                return num1 / num2;
            default:
               return -1;
        }
    }
}

class taskSeven{
    static void swapper(double num1,double num2){
        System.out.println("before swalling: "+num1 +" and "+num2);
        double temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("before swalling: "+num1 +" and "+num2);
    }
}

class taskEight{
    static String oddOrEven(int num){
        if (num%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
}

class taskNine{
    static double largest(double num1, double num2,double num3){
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}

// class teskTen{
//     static 
// }

class pracOne{
    public static void main(String[] args){
        
        //task one
        int a=2;
        int b=3;
        System.out.println("sum: "+taskOne.sumOfTwoNumbers(a,b));
        //task two
        double purchasePrice = 1000.0;
        int yearsOfService = 5;
        double annualDepreciation = 100.0;

        double salvageValue = taskTwo.calculateSalvageValue(purchasePrice, yearsOfService, annualDepreciation);
        System.out.println("Salvage Value: " + salvageValue);

        //task three
        double acceleration=9.8; 
        double initialVelocity=10; 
        double time=3;

        double distance=taskThree.calculateDistance(acceleration,initialVelocity,time);
        System.out.println("Distance: " + distance);

        //task four 
        System.out.println("reverse number: "+taskFour.reverse());

        //task five
        System.out.println("average: "+taskFive.calculateAverage(89,90,89,91,91));

        //task six
        System.out.println("calculator: "+taskSix.calculator(2,3,2));

        //task seven
        taskSeven.swapper(2,3);

        //task eight
        System.out.println("odd or even: "+taskEight.oddOrEven(3));

        //taskNine
        System.out.println("largest: "+taskNine.largest( 3,2,1));


    //task ten

        

    }
}