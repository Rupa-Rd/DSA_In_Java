//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f = 0;
        System.out.print(f + " ");
        while (n != 1) {

            System.out.print(f2 + " ");
            f = f2;
            f2 += f1;
            f1 = f;
            n -= 1;
        }
    }
}
