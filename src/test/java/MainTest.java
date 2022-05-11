import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void calculatorAddition() {
        Assert.assertEquals(Main.calculator(5, '+', 5), 10);
    }
    @Test
    public void calculatorSubtraction() {
        Assert.assertEquals(Main.calculator(5, '-', 5), 0);
    }
    @Test
    public void calculatorMultiplication() {
        Assert.assertEquals(Main.calculator(5, '*', 5), 25);
    }
    @Test
    public void calculatorDivision() {
        Assert.assertEquals(Main.calculator(5, '/', 5), 1);
    }

}