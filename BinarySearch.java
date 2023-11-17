import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        // int n = in.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of the array ");
        // for (int i = 0; i < n; i++) {
        // arr[i] = in.nextInt();
        // }
        // System.out.print("Enter the element to search: ");
        // int target = in.nextInt();
        int[] arr = { 23, 25, 34, 55, 67, 77, 89 };
        int target = 34;
        System.out.println("The element " + target + " is found at the index " + search(arr, target));
    }

    static int search(int[] arr, int target) {
        int beg = 0;
        int end = arr.length - 1;
        int index = -1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return index;
    }
}
