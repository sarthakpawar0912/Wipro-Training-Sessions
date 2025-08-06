package Junit.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest2 {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals("Result", 5, calculator.add(2, 3));
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        assertEquals("Result", 9, calculator.sub(12, 3));
    }

    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        assertEquals("Result", 6, calculator.mul(2, 3));
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals("Result", 4, calculator.div(12, 3));
    }

    @Test
    public void testMod() {
        Calculator calculator = new Calculator();
        assertEquals("Result", 1, calculator.mod(5, 2));
    }
}