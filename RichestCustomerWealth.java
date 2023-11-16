import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Row Size: ");
        int n = in.nextInt();
        System.out.print("Enter the Col Size: ");
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("-Enter the elements of the array-");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println("The Richest Customer Wealth : " + BruteForce(arr));
    }

    static int BruteForce(int[][] arr) {
        int max_wealth = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            if (sum > max_wealth) {
                max_wealth = sum;
            }
        }
        return max_wealth;
    }
}
