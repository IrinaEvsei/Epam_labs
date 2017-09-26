package com.main.java.bsu.epam_labs.lab_3;

import java.util.Scanner;

/**
 * Created by irisha on 26.09.2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a,b;

        System.out.println("Введите а ");
        a = in.nextInt();

        System.out.println("Введите b ");
        b = in.nextInt();

        System.out.println(" a+b = " + (a+b));
        System.out.println(" a-b = " + (a-b));
        System.out.println(" a*b = " + (a*b));
        if(b==0) {
            System.out.println("ERROR!");
        }
        else {
            System.out.println(" a/b = " + (a/b));
        }
    }
}
