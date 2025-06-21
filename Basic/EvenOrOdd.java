//Write a program that reads a set of integers and the print the sum of the even and odd integers.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number, choice, evenSum = 0, oddSum = 0;
        do {
            System.out.print("Enter the number:");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Do you want to Continue? Press 1 for yes or 0 for no!");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of Even Numbers:" + evenSum);
        System.out.println("Sum of Odd Numbers:" + oddSum);

    }
}