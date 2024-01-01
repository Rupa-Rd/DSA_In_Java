// Areas
/*1. Circle - pi*r*r 
 * 2. Triangle - 0.5*base*height
 * 3. Rectangle - length * breadth
 * 4. Isosceles - 0.5*base*height
 * 5. Parallelogram - base * height
 * 6. Rhombus - 0.5 * diagonal1 * diagonal2
 * 7. Equilateral Triangle - sqrt(3) / 4 * side * side
 */
package SimpleLogicPrograms;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CircleArea();
        TriangleArea();
        RectangleArea();
        ParallelogramArea();
        RhombusArea();
        EquilateralArea();

    }

    static void CircleArea() {
        System.out.print("Enter the radius: ");
        float radius = in.nextFloat();
        float area = (float) 3.14 * radius * radius;
        System.out.println("Area of the circle : " + area + " sq.units");
    }

    static void TriangleArea() {
        System.out.print("Enter the Base: ");
        float base = in.nextFloat();
        System.out.print("Enter the Height: ");
        float height = in.nextFloat();

        float area = (float) 0.5 * base * height;
        System.out.println("Area of a triangle:" + area);
    }

    static void RectangleArea() {
        System.out.print("Enter the length: ");
        float length = in.nextFloat();
        System.out.print("Enter the Breadth: ");
        float breadth = in.nextFloat();
        float area = (float) length * breadth;
        System.out.println("Area of a Rectangle:" + area);
    }

    static void ParallelogramArea() {
        System.out.print("Enter the Base: ");
        float base = in.nextFloat();
        System.out.print("Enter the Height: ");
        float height = in.nextFloat();
        float area = base * height;
        System.out.println("Area of a Parallelogram:" + area);
    }

    static void RhombusArea() {
        System.out.print("Enter the Diagonal1: ");
        float diagonal1 = in.nextFloat();
        System.out.print("Enter the Diagonal2: ");
        float diagonal2 = in.nextFloat();

        float area = (float) 0.5 * diagonal1 * diagonal2;
        System.out.println("Area of a Rhombus:" + area);
    }

    static void EquilateralArea() {
        System.out.print("Enter the Side: ");

        float side = in.nextFloat();
        float area = (float) sqrt(3) / 4 * side * side;
        System.out.println("Area of a triangle:" + area);
    }

}
