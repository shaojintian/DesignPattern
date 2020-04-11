package factory.simple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void testAdd() {
        assertEquals(30, Calculator.calculate("add", 10, 20), 0);
    }
}
