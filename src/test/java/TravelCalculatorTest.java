import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.TravelCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TravelCalculatorTest {

    @Test
    @DisplayName("Calculate normal speed: 100km in 2h should be 50km/h")
    void testStandardSpeed() {
        double result = TravelCalculator.speedCalculator(100.0, 2.0);
        assertEquals(50.0, result, "The speed calculation is incorrect.");
    }

    @Test
    @DisplayName("Handle decimal values: 10.5km in 0.5h should be 21km/h")
    void testDecimalSpeed() {
        double result = TravelCalculator.speedCalculator(10.5, 0.5);
        assertEquals(21.0, result, 0.001);
    }

    @Test
    @DisplayName("Division by zero should return Infinity (Standard Java behavior)")
    void testDivisionByZero() {
        double result = TravelCalculator.speedCalculator(100.0, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, result, "Should return Infinity when dividing by zero.");
    }
}
