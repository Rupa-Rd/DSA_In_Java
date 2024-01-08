public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        // Binary search using recursion
        int[] arr = { 2, 4, 5, 23, 45, 67, 89 };
        int target = 100;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        } else {
            return search(arr, target, mid + 1, end);
        }
    }
}
