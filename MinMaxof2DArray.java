import java.util.Scanner;

public class MinMaxof2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the 2d array: ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("-Enter the elements of the array-");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println("Minimum element of the array: " + min(arr));
        System.out.println("Maximum element of the array: " + max(arr));
    }

    static int max(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        return max;
    }

    static int min(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] < min) {
                    min = array[row][col];
                }
            }
        }
        return min;
    }
}
