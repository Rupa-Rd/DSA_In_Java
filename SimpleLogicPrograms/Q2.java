package SimpleLogicPrograms;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        float base = in.nextFloat();
        System.out.print("Enter the Height: ");
        float height = in.nextFloat();
        float area = (float) 0.5 * base * height;
        System.out.println("Area of a triangle:"+area);
        

    }
}
