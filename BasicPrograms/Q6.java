//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount in Rs: ");
        double rs = in.nextDouble();
        double usd = rs * 0.012;
        System.out.println("Amount in USD: " + usd);
    }
}
