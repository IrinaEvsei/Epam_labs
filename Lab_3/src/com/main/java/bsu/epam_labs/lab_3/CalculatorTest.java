package com.main.java.bsu.epam_labs.lab_3;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by irisha on 27.09.2017.
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addition() throws Exception {
        int addition = calculator.addition(3,4);
        assertEquals("Error in addition ()",7,addition);
    }

    @Test
    public void subtraction() throws Exception {
        int subtraction = calculator.subtraction(3,4);
        assertEquals("Error in subtraction()",-1,subtraction);
    }

    @Test
    public void division() throws Exception {
        double division = calculator.division(4,3);
        assertEquals("Error in division()",1,division);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        double division = calculator.division(1,0);
        assertEquals("Error!!! in division()","a cannot be divided by 0!",division);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<>().get(0);
    }

    @Test
    public void multiplication() throws Exception {
        int multiplication = calculator.multiplication(3,4);
        assertEquals("Error in multiplication()",12,multiplication);
    }
}