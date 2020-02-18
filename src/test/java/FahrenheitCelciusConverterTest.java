import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

    @RunWith(JUnitParamsRunner.class)
    public class FahrenheitCelciusConverterTest {
        public static final Object[] getDegrees() {
            return new Object[] {
                    new Object[] {32, 0}, new Object[] {98, 37}, new Object[] {212, 100}
            };
        }

        @Parameters(method = "getDegrees")
        @Test
        public void shouldConvertCelciusToFahrenheit(double fahr, double celc) {
            assertEquals(fahr, FahrenheitCelciusConverter.toFahrenheit(celc), 0.6);
        }

        @Parameters(method = "getDegrees")
        @Test
        public void shouldConvertFahrenheitToCelcius(double fahr, double celc) {
            assertEquals(celc, FahrenheitCelciusConverter.toCelcius(fahr), 0.6);
        }
    }

