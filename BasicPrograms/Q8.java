//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = in.nextInt();
        int original = number;
        int reverse = 0;
        while (number != 0) {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number /= 10;
        }
        System.out.println(reverse == original ? "Palindrome!" : "Not Palindrome");
    }
}
