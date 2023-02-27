package org.example;

import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() throws InterruptedException {
        Thread.sleep(30000);
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2));
    }

    @Test
    public void testMultiply() throws InterruptedException {
        Thread.sleep(30000);
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


