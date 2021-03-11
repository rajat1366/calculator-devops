import calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding Square of integers",2,calculator.squareRoot(4),DELTA);
        assertEquals("Finding Square of double",2.073644135332772,calculator.squareRoot(4.3),DELTA);
    }
    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding Square of integers",3,calculator.squareRoot(4),DELTA);
        assertNotEquals("Finding Square of double",3.07364,calculator.squareRoot(4.3),DELTA);
    }
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of integers",3628800,calculator.factorial(10),DELTA);

    }
    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding Square of integers",20,calculator.squareRoot(4),DELTA);

    }
    @Test
    public void naturalLogTruePositive(){
        assertEquals("Finding factorial of integers",2.302585092994046,calculator.naturalLog(10),DELTA);

    }
    @Test
    public void naturalLogFalsePositive(){
        assertNotEquals("Finding Square of integers",1,calculator.naturalLog(4),DELTA);

    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding factorial of integers",1024,calculator.power(2,10),DELTA);

    }
    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding Square of integers",17,calculator.power(4,2),DELTA);

    }

}
