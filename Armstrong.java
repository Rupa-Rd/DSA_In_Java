import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 3 digit number to check for Armstrong :");
        int num = in.nextInt();
        boolean res = isArmstrong(num);
        if (res) {
            System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is not Armstrong");
        }

    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
