import java.util.Scanner;

public class SearchIn2DArray {
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
        System.out.print("Enter the element to be searched: ");
        int target = in.nextInt();
        int[] ans = search(arr, target);
        System.out.println("The target element " + target + " is found at " + ans[0] + " row and " + ans[1] + " col");
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };

                }
            }
        }
        return new int[] { -1, -1 };
    }
}
