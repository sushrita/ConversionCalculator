package plumpypanda.com.conversioncalculator;

public class Utils
{
    //converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
    //converts to inches
    public static double convertcentimeterToInch(float cm) {
        return (cm / 2.54);
    }

    // converts to centimeters
    public static double convertInchTocentimeter(float inch) {
        return inch*2.54;
    }


}
