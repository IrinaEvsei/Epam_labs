package com.test.java.bsu.epam_labs.test;

import com.main.java.bsu.epam_labs.lab_3.Calculator;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    public static void main(String[] args) {
        JUnitCore core = new JUnitCore();
        core.run(CalculatorTest.class);
    }
    @Test
    public void addition() throws Exception {
        int addition = calculator.addition(3, 4);
        assertEquals("Error in addition ()",7,addition);
    }

    @Test
    public void subtraction() throws Exception {
        int subtraction = calculator.subtraction(3,4);
        assertEquals("Error in subtraction()",-1,subtraction);

        Calculator calc = new Calculator();
        int res=calc.subtraction(15, 5);
        assertEquals("It's true!",10, res);

        Calculator sub = new Calculator();
        assertEquals(1, sub.subtraction(2, 1));
    }

    @Test
    public void division() throws Exception {
        double division = calculator.division(4.0,3.0);
        assertEquals("division()",1,division);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        double division = calculator.division(2,0);
        assertEquals(" 'a' cannot be divided by 0!","true",division);
    }

    @Test
    public void multiplication() throws Exception {
        int multiplication = calculator.multiplication(3,4);
        assertEquals("Error in multiplication()",12,multiplication);
    }
}