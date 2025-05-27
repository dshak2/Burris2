import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
// Assuming Calculadora is in Hacker200 package, and tests might be in a different one or need import.
// If CalculatorTest.java is in the same package (e.g. default or Hacker200), this import is not strictly needed.
// However, to be explicit, especially if they were in different packages in a real project:
import Hacker200.Calculadora;


public class CalculatorTest {

    @Test
    public void testAdd() {
        // Calculator calculator = new Calculator(); // Removed instance creation

        // Test case 1: Adding two positive numbers
        assertEquals(5, Calculadora.add(2, 3));

        // Test case 2: Adding a positive and a negative number
        assertEquals(-1, Calculadora.add(2, -3));

        // Test case 3: Adding two negative numbers
        assertEquals(-5, Calculadora.add(-2, -3));

        // Test case 4: Adding zero to a number
        assertEquals(2, Calculadora.add(2, 0));
        assertEquals(0, Calculadora.add(0, 0));
        assertEquals(-2, Calculadora.add(-2, 0));
    }
}
