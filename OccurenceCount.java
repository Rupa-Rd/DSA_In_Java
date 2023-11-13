import java.util.Scanner;

public class OccurenceCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = in.nextInt();
        System.out.println("Enter a number to check the occurence:");
        int m = in.nextInt();
        int count = 0;
        int rem = 0;
        while (n != 0) {
            rem = n % 10;
            if (rem == m) {
                count++;
            }
            n /= 10;
        }
        System.out.println("Number of times " + m + " occured in number is " + count);
    }
}
