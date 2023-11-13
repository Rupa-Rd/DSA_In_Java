import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Integer Input
        System.out.print("Enter an Integer:");
        int roll_no = input.nextInt();

        // Float Input
        System.out.print("Enter a Float:");
        float mark = input.nextFloat();

        // Enter a string
        System.out.print("Enter yout Name:");
        String name = input.next();

        // Enter a character
        System.out.print("Enter your gender:");
        String gender = input.next();

        // Boolean Input
        System.out.print("Pass or Fail:");
        boolean check = input.nextBoolean();

        // Enter a double value
        System.out.print("Enter a double value:");
        double val = input.nextDouble();

        // Print Values

        System.out.println("Your name is " + name);
        System.out.println("Your Roll_No is " + roll_no);
        System.out.println("Your Gender is " + gender);
        System.out.println("Your mark is " + mark);
        System.out.println("Your Pass/Fail " + check);
        System.out.println("Your double value " + val);

    }
}
