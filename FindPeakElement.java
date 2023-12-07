//https://leetcode.com/problems/find-peak-element/description/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3 };
        int ans = peak(arr);
        System.out.println(ans);
    }

    public static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
