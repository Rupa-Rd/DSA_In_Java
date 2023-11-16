// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // System.out.println(BruteForce(arr));
        System.out.println(Optimize(arr));
    }

    // Bruteforce method to approach the solution

    static int BruteForce(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int digit = 0;
            while (temp > 0) {
                digit += 1;
                temp = temp / 10;
            }
            if (digit % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    // Optimized space complexity for this problem

    static int Optimize(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int digit = 0;
            digit = (int) (Math.log10(arr[i])) + 1;
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
