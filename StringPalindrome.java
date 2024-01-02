public class StringPalindrome {
    public static void main(String[] args) {
        String str = "aabbaa";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            char char1 = str.charAt(start);
            char char2 = str.charAt(end);
            if (char1 != char2) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
    // or
    // static boolean isPalindrome(String str){
    // if(str == null || str.length() == 0){
    // return true;
    // }
    // for (int i = 0; i < str.length() /2; i++) {
    // char start = str.charAt(i);
    // char end = str.charAt(str.length() - i-1);
    // if(start != end){
    // return false;
    // }

    // }
    // return true;
    // }
}
