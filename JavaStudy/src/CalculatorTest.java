import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class CalculatorTest {
    
    private Calculator cal;

    @Before
    public void setup(){
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void add(){
        assertEquals(9, cal.add(6, 3));
        System.out.println("add");
    }

    @Test
    public void substract(){
        assertEquals(3, cal.substract(6, 3));
        System.out.println("sub");
    }

    @After
    public void teardown(){
        System.out.println("teardown");
    }
}
