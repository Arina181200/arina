import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator=new Calculator();

    @Test
    public void sumLongTest()
    {
        long result=calculator.sum(200,500);
        Assert.assertEquals(result,700);
    }

    @Test
    public  void sumDoubleTest()
    {
        double result=calculator.sum(12.5d,13.5d);
        Assert.assertEquals(result,26d);
    }

    @Test
    public  void subLongTest()
    {
        long result=calculator.sub(12,7);
        Assert.assertEquals(result,5);
    }
    @Test
    public  void subDoubleTest()
    {
        double result=calculator.sub(12.5d,7.5d);
        Assert.assertEquals(result,5);
    }
    @Test
    public  void multLongTest()
    {
        long result=calculator.mult(12,5);
        Assert.assertEquals(result,60);
    }
    @Test
    public  void multDoubleTest()
    {
        double result=calculator.mult(12.5d,2d);
        Assert.assertEquals(result,25d);
    }
    @Test
    public  void divLongTest()
    {
        long result=calculator.div(12,6);
        Assert.assertEquals(result,2);
    }
    @Test
    public  void divDoubleTest()
    {
        double result=calculator.div(12.5d,5d);
        Assert.assertEquals(result,2.5d);
    }
    @Test
    public  void powDoubleTest()
    {
        double result=calculator.pow(12.5d,2d);
        Assert.assertEquals(result,156.25);
    }
    @Test
    public  void sqrtDoubleTest()
    {
        double result=calculator.sqrt(36d);
        Assert.assertEquals(result,6d);
    }
    @Test
    public  void tgDoubleTest()
    {
        double result=calculator.tg(1d);
        Assert.assertEquals(result,1d);
    }
    @Test
    public  void ctgDoubleTest()
    {
        double result=calculator.ctg(1d);
        Assert.assertEquals(result,0.7615941559557649d);
    }
    @Test
    public  void sinDoubleTest()
    {
        double result=calculator.sin(1d);
        Assert.assertEquals(result,0.8414709848078965d);
    }
    @Test
    public  void cosDoubleTest()
    {
        double result=calculator.cos(1d);
        Assert.assertEquals(result,0.8414709848078965d);
    }
    @Test
    public  void isPositiveDoubleTest()
    {
        boolean result=calculator.isPositive(1);
        Assert.assertEquals(result,true);
    }
    @Test
    public  void isNegativeDoubleTest()
    {
        boolean result=calculator.isNegative(1);
        Assert.assertEquals(result,false);
    }
}
