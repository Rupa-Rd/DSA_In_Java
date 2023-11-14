import java.util.Scanner;

public class MinArrayUsingLinearSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 1, 11, 2, 12 };
        System.out.println(PrintMin(arr));
    }

    static int PrintMin(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] <= min) {
                min = arr[index];
            }
        }
        return min;
    }
}
