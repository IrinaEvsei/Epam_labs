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
        assertEquals("Error in multiplication()",7,addition);
    }

    @Test
    public void subtraction() throws Exception {
        int subtraction = calculator.addition(3,4);
        assertEquals("Error in multiplication()",7,subtraction);

    }

    @Test
    public void division() throws Exception {
        int division = calculator.addition(3,4);
        assertEquals("Error in multiplication()",7,division);
    }

    @Test
    public void multiplication() throws Exception {
        int multiplication = calculator.addition(3,4);
        assertEquals("Error in multiplication()",7,multiplication);
    }
}