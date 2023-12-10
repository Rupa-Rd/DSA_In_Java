
//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A:");
        int a = in.nextInt();
        System.out.print("B:");
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a + " is Greater");
        } else {
            System.out.println(b + " is Greater");
        }
    }
}
