package org.xproce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 devrait être égal à 5");

        result = calculator.add(-1, 1);
        assertEquals(0, result, "-1 + 1 devrait être égal à 0");

        result = calculator.add(0, 0);
        assertEquals(0, result, "0 + 0 devrait être égal à 0");
    }
}
