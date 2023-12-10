
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A:");
        int a = in.nextInt();
        System.out.print("B:");
        int b = in.nextInt();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter choice:");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.print(a + " + " + b + " = " + (a + b));
        } else if (choice == 2) {
            System.out.print(a + " - " + b + " = " + (a - b));
        } else if (choice == 3) {
            System.out.print(a + " * " + b + " = " + (a * b));
        } else {
            System.out.print(a + " / " + b + " = " + (a / b));
        }
    }
}
