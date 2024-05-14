import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testDivide() {
        // given
        Calculator calculator = Calculator.instance.get();
        int dividend = 10;
        int divisor = 2;

        // when
        int result = calculator.divide.apply(dividend, divisor);

        // then
        assertEquals(5, result);
    }

    @Test
    public void testDivide_zero() {
        // given
        Calculator calculator = Calculator.instance.get();
        int dividend = 10;
        int divisor = 0;

        // when & then
        assertThrows(ArithmeticException.class, () -> calculator.divide.apply(dividend, divisor));
    }
    @Test
    public void testAbs() {
        // given:
        Calculator calculator = Calculator.instance.get();
        int negativeNumber = -5;
        int positiveNumber = 7;

        // when:
        int negativeResult = calculator.abs.apply(negativeNumber);
        int positiveResult = calculator.abs.apply(positiveNumber);

        // then:
        assertEquals(5, negativeResult);
        assertEquals(7, positiveResult);
    }
}