public class FahrenheitCelciusConverter {
    public static double toFahrenheit(double celc) {
        return(celc * 9/5.0) + 32;
    }

    public static double toCelcius(double fahr) {
        return (fahr - 32) *5.0/9;
    }
}
