package factory.abstraction;


import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void testAdd() {
        assertEquals(30, Calculator.calculate("add", 10, 20), 0);
    }
}
