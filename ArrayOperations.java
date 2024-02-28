import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        // Adding element at the position
        System.out.println(Arrays.toString(add(nums)));

        // Updating element in the array
        System.out.println(Arrays.toString(replace(nums)));

        // Deleting element from the array
        System.out.println(Arrays.toString(delete(nums)));

    }

    static int[] add(int[] nums) {
        int position = 3;
        int element = 10;
        int[] newNums = new int[nums.length + 1];
        // newNums = {1,2,3,10,4,5,6}
        for (int i = 0; i < newNums.length; i++) {
            if (i == position) {
                newNums[i] = element;
            } else if (i > position) {
                newNums[i] = nums[i - 1];
            } else {
                newNums[i] = nums[i];
            }
        }
        return newNums;
    }

    static int[] replace(int[] nums) {
        int pos = 3;
        int element = 8;
        // newNums = {1,2,3,8,5,6};
        int[] newNums = new int[nums.length];
        for (int i = 0; i < newNums.length; i++) {
            if (i == pos) {
                newNums[i] = element;
            } else {
                newNums[i] = nums[i];
            }
        }
        return newNums;
    }

    static int[] delete(int[] nums) {
        int pos = 0;
        int[] newNums = new int[nums.length - 1];
        for (int i = 0; i < newNums.length; i++) {
            if (i >= pos) {
                newNums[i] = nums[i + 1];
            } else {
                newNums[i] = nums[i];
            }
        }

        return newNums;
    }
}
