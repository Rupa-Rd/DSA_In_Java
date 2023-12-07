public class PositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 8, 11, 14, 15, 18, 34, 55, 67, 88, 89 };
        int target = 34;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] array, int target) {
        int start = 0;
        int end = 1;
        int ans = -1;
        while (target > array[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1);
            start = newStart;
        }
        ans = search(array, target, start, end);
        return ans;
    }

    public static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
