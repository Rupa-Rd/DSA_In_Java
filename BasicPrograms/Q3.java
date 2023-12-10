//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float principal = in.nextFloat();
        System.out.print("Enter Time: ");
        float time = in.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float rate = in.nextFloat();
        float SimpleInterest = principal * (1 + (rate * time / 100.0f));
        System.out.println("Simple Interest: " + SimpleInterest);
    }
}
