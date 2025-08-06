import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheitResult = celsiusToFahrenheit(celsius);
                System.out.println("Temperature in Fahrenheit: " + fahrenheitResult + "°F");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsiusResult = fahrenheitToCelsius(fahrenheit);
                System.out.println("Temperature in Celsius: " + celsiusResult + "°C");
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        sc.close();
    }
}
