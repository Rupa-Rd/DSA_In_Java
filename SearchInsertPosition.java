//https://leetcode.com/problems/search-insert-position/description/?envType=study-plan-v2&envId=binary-search

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 7;
        // Accepted Ans = 4
        System.out.println(InsertPosition(arr, target));

    }

    static int InsertPosition(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (nums[mid] == target) {
                return mid;

            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return end + 1;
    }
}
