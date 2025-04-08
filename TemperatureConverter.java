import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature: ");
        double temp = input.nextDouble();

        System.out.print("Convert to (C, F, or K): ");
        String unit = input.next().toUpperCase();

        if (unit.equals("C")) {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Result: " + celsius + " °C");
        } else if (unit.equals("F")) {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Result: " + fahrenheit + " °F");
        } else if (unit.equals("K")) {
            double kelvin = temp + 273.15;
            System.out.println("Result: " + kelvin + " K");
        } else {
            System.out.println("Invalid unit.");
        }

        input.close();
    }
}
