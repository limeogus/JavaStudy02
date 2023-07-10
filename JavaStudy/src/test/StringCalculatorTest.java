import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator cal;

    @Before
    public void setup(){
        cal = new StringCalculator();
    }

    @Test
    public void add01(){
        assertEquals(cal.add(" "), 0);
        assertEquals(cal.add(null), 0);
    }

    @Test
    public void add02(){
        cal.add("1,2");
        assertEquals(cal.add("1,2"), 3);     
    }

    @Test
    public void add03(){
        cal.add("1,2,3");
        assertEquals(cal.add("1,2,3"), 6);     
    }

    @Test
    public void add04(){
        cal.add("1,2:3");
        assertEquals(cal.add("1,2:3"), 6);     
    }

    @Test
    public void add05(){
        cal.add("//;\\n1;2;3");
        
        //assertEquals(cal.add("//;\n1;2;3"), 6);     
    }
}
