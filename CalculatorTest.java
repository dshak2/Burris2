import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        // Test case 1: Adding two positive numbers
        assertEquals(5, calculator.add(2, 3));

        // Test case 2: Adding a positive and a negative number
        assertEquals(-1, calculator.add(2, -3));

        // Test case 3: Adding two negative numbers
        assertEquals(-5, calculator.add(-2, -3));

        // Test case 4: Adding zero to a number
        assertEquals(2, calculator.add(2, 0));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-2, calculator.add(-2, 0));
    }
}
