import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sub() {
        CalculatorInterface calc = new CalculatorServiceImpl();
        int result = calc.sub(50,10);
        Assert.assertEquals("sub 2-3", 40, result);
    }

}
