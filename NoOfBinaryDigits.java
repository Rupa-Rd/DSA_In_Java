public class NoOfBinaryDigits {
    public static void main(String[] args) {
        int n = 16;
        int binaryDigits = 0;
        // while (n > 0) {
        // binaryDigits++;
        // n = n >> 1;
        // }
        // System.out.println(binaryDigits);
        // or
        // below code is to find number of digits in a number with base b
        // Formula = int(log n / log base) + 1;
        int base = 8;
        binaryDigits = (int) (Math.log(n) / Math.log(base)) + 1;
        System.out.println(binaryDigits);

    }
}
