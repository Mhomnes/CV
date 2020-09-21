
public class Degrees {
    public static void main(String[] args) {
        System.out.println("Celsius   Fahrenheit    Fahrenheit   Celsius");
        for (double celsius = 40.0, fahrenheit = 120.0;
        celsius >= 31.0; celsius--, fahrenheit -=10) {
            System.out.printf("%.2f %10.2f %13.2f %11.2f\n", celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0/5.0) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0/9.0) * (fahrenheit - 32);
    }
}
