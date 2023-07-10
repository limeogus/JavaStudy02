import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void add(){
        Calculator cal = new Calculator();
        assertEquals(9, cal.add(6, 3));
    }

    @Test
    public void substract(){
        Calculator cal = new Calculator();
        assertEquals(3, cal.substract(6, 3));
    }
}
