import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    private static FactorialCalculator calculator;

    @BeforeAll
    public static void createNewCalc() {
             calculator = new FactorialCalculator();
    }

    @Test
    void testFactorialOfZero() {
        assertEquals(1, calculator.factorial(0), "Факториал 0 должен быть равен 1");
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, calculator.factorial(1), "Факториал 1 должен быть равен 1");
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, calculator.factorial(5), "Факториал 5 должен быть равен 120");
        assertEquals(720, calculator.factorial(6), "Факториал 6 должен быть равен 720");
    }

    @Test
    void testFactorialOfLargeNumber() {
        assertEquals(2432902008176640000L, calculator.factorial(20), "Факториал 20 должен быть равен 2432902008176640000");
    }

    @Test
    void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        }, "Факториал отрицательного числа должен выбрасывать исключение IllegalArgumentException");
    }
}
