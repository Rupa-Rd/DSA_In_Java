//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=study-plan-v2&envId=binary-search

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = { 'x', 'x', 'y', 'y' };
        char target = 'z';
        // Accepted ans = x
        System.out.println(SmallestLetter(arr, target));
    }

    static char SmallestLetter(char[] letters, char target) {
        int beg = 0;
        int end = letters.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return letters[beg % letters.length];
    }
}
