//WAP to find the factorail of any number entered by the user.

import java.util.Scanner;;

public class Factorial{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int num,fact=1;
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial:"+fact);
    }
}