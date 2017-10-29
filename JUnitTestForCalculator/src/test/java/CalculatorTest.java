import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Test
    public final void addPositiveValues() {
        double actual = calculator.addition(3.0, 4.0);
        double expected = 7;
        assertEquals("It's true", actual, expected);
    }

    @Test
    public final void addPositiveToNegativeValues() {
        double actual = calculator.addition(-3.0, 4.0);
        double expected = 1;
        assertEquals("It's true", actual, expected);
    }

    @Test
    public final void addNegativeToPositiveValues() {
        double actual = calculator.addition(3.0, -4.0);
        double expected = -1;
        assertEquals("It's true", actual, expected);
    }

    @Test
    public final void addNegativeValues() {
        double actual = calculator.addition(-3, -4);
        double expected = -7;
        assertEquals(actual, expected);
    }

    @Test()
    public final void subtractPositiveFromNegativeValues() {
        double actual = calculator.subtraction(-10.0, 6.0);
        double expected = -16;
        assertEquals(actual, expected);
    }

    @Test()
    public final void subtractNegativeFromPositiveInputValues() {
        double actual = calculator.subtraction(10.0, -6.0);
        double expected = 16;
        assertEquals(actual, expected);
    }

    @Test()
    public final void subtractNegativeValues() {
        double actual = calculator.subtraction(-10.0, -6.0);
        double expected = -4;
        assertEquals(actual, expected);
    }

    @Test
    public final void multiplyPositiveValues() {
        double actual = calculator.multiplication(10.0, 6.0);
        double expected = 60.0;
        assertEquals(actual, expected);
    }

    @Test
    public final void multiplyNegativeAndPositiveValues() {
        double actual = calculator.multiplication(-10.0, 6.0);
        double expected = -60.0;
        assertEquals(actual, expected);
    }

    @Test
    public final void multiplyNumberToOne() {
        double actual = calculator.multiplication(1.0, 6.0);
        double expected = 6.0;
        assertEquals(actual, expected);
    }

    @Test
    public final void multiplyNumberToZero() {
        double actual = calculator.multiplication(0.0, 6.0);
        double expected = 0.0;
        assertEquals(actual, expected);
    }

    @Test
    public final void dividePositiveValues() {
        double actual = calculator.division(10.0, 6.0);
        double expected = 1.0;
        assertEquals(actual, expected);
    }

    @Test
    public final void divideDifferentValues() {
        double actual = calculator.division(-10.0, 6.0);
        double expected = -1.0;
        assertEquals(actual, expected);    }

    @Test
    public final void divideByNumberOne() {
        double actual = calculator.division(-10.0, 1.0);
        double expected = -10.0;
        assertEquals(actual, expected);    }

    @Test()
    public final void divideZeroByNumber() {
        double actual = calculator.division(0, 13);
        double expected = 0;
        assertEquals(actual, expected);
    }

    @Test(expected = ArithmeticException.class)
    public void divideNumberByZero_ThrowsArithmeticException() {
        double division = calculator.division(2.0, 0.0);
        assertEquals("Arithmetic Exception",division);
    }

    @Test(expected = ArithmeticException.class)
    public void divideZeros_ThrowsArithmeticException() {
        double division = calculator.division(0.0, 0.0);
        assertEquals("Arithmetic Exception",division);
    }

}