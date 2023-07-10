import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class CalculatorTest {
    
    private Calculator cal;

    @Before
    public void setup(){
        cal = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(9, cal.add(6, 3));
    }

    @Test
    public void substract(){
        assertEquals(3, cal.substract(6, 3));
    }
}
