// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

    }
}
