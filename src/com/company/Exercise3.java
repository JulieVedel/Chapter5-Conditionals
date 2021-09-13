package com.company;

import java.lang.Math;

public class Exercise3 {

    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 9;
        int n = 7;

        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else {
            System.out.println("No, that doesn’t work.");
        }


    }
}
