package com.main.java.bsu.epam_labs.lab_3;


import com.test.java.bsu.epam_labs.test.CalculatorTest;
import org.junit.runner.JUnitCore;

public class Calculator {


    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(" 'a' cannot be divided by 0!");
        }
        return a / b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }

}