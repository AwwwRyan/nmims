
import java.util.Scanner;

class pracseven{

    static int counting(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static String concat(String str1, String str2) {
        return str1 + str2;
    }

    static boolean palindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character you want the number of occurances for: ");
        char char1=sc.next().charAt(0);
        System.out.println("count of that char: "+counting("helloji", char1));

        
    }
}