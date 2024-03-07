import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

        @org.junit.jupiter.api.Test
        void add() {
            Calculator calculator = new Calculator();
            assertEquals(5, calculator.add(2, 3));
        }

        @org.junit.jupiter.api.Test
        void subtract() {
            Calculator calculator = new Calculator();
            assertEquals(2, calculator.subtract(5, 3));
        }

        @org.junit.jupiter.api.Test
        void multiply() {
            Calculator calculator = new Calculator();
            assertEquals(6, calculator.multiply(2, 3));
        }

        @org.junit.jupiter.api.Test
        void divide() {
            Calculator calculator = new Calculator();
            assertEquals(2, calculator.divide(6, 3));
        }

}