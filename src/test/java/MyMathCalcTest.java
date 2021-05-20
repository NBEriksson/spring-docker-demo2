import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class MyMathCalcTest {

    @Test
    @DisplayName("add()")
    void add() {
        MyMathCalc myMathCalc = new MyMathCalc();
        int expected = 12;
        int actual = myMathCalc.add(8, 4);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multiply()")
    void multiply() {
        MyMathCalc myMathCalc = new MyMathCalc();
        int expected = 12;
        int actual = myMathCalc.multiply(3, 4);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("divide()")
    void divide() {
        MyMathCalc myMathCalc = new MyMathCalc();
        int expected = 4;
        double actual = myMathCalc.divide(12, 3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("divideByZero()")
    void divideByZero() {
        MyMathCalc myMathCalc = new MyMathCalc();
        Exception exception = assertThrows(ArithmeticException.class, () -> myMathCalc.divide(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }
}