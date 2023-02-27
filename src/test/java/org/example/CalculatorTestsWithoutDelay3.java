package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTestsWithoutDelay3 {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() throws InterruptedException {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2));
    }

    @Test
    public void testMultiply() throws InterruptedException {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }
}
