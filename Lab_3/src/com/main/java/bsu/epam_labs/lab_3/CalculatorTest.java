package com.main.java.bsu.epam_labs.lab_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by irisha on 27.09.2017.
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addition() throws Exception {
        int addition = calculator.addition(3,4);
        assertEquals("Error in addition()",7,addition);
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

    @Test
    public void multiplication() throws Exception {
        int multiplication = calculator.multiplication(3,4);
        assertEquals("Error in multiplication()",12,multiplication);
    }
}