//To find Armstrong Number between two given number.

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter start and end: ");
        int start = in.nextInt();
        int end = in.nextInt();

        for (int number = start; number <= end; number++) {
            int n = number;
            int original = number;
            int Armstrong = 0;
            while (n != 0) {
                int rem = n % 10;
                Armstrong = Armstrong + (rem * rem * rem);
                n /= 10;

            }

            if (Armstrong == original) {
                System.out.println(Armstrong);
            }

        }

    }
}
