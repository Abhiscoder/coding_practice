import java.util.*;

public class PalindromeNumber {
    public static void main(String args[]) {
        int number = 121;
        int reverse = 0;
        int original=number;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original == reverse) {
            System.out.println("Plaindrome");
        } else {
            System.out.println("Not Plaindrome");
        }
    }
}