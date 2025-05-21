import CalculatorProject___T.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
    private Calculator calculator;
    private int firstNumber;
    private int secondNumber;
    private int result;

    @Before
    public void initTest(){
        calculator = new Calculator();
        firstNumber = 3;
        secondNumber = 5;
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void multiply() {
        result = calculator.multiply(firstNumber, secondNumber);
        Assert.assertEquals(15, result);
        //assertEquals( ERWARTE, BERECHNETER WERT);
    }

//    @Test
//    public void subtract(){
//        result = calculator.subtract(firstNumber, secondNumber);
//        Assert.assertEquals(-2, result);
//    }
}
