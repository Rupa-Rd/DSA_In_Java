import java.util.Scanner;

public class CelsiusToFahernheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius: ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9 / 5) + 32;
        System.out.println("Temperature in Fahernheit: " + tempF);
    }
}
