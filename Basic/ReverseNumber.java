import java.util.*;

public class ReverseNumber{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        while(n>0){
            int lastDigit = n%10; // find the last digit
            System.out.print(lastDigit);
            n=n/10; // Remove the last digit 
        }
        System.out.println();
    }
}