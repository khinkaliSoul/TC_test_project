package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTestWithDelays {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() throws InterruptedException {
        Thread.sleep(10000);
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSubtract() throws InterruptedException {
        Thread.sleep(10000);
        assertEquals(2, calculator.subtract(4, 2));
    }

    @Test
    public void testMultiply() throws InterruptedException {
        Thread.sleep(10000);
        assertEquals(7, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() throws InterruptedException {
        Thread.sleep(10000);
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    public void testDivideByZero() throws InterruptedException {
        Thread.sleep(10000);
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }
}
