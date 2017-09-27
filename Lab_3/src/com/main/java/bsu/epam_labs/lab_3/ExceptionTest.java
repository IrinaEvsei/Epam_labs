package com.main.java.bsu.epam_labs.lab_3;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by irisha on 27.09.2017.
 */
public class ExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<>().get(0);
    }

}
