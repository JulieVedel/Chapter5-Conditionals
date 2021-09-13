package com.company;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Write the length of the first stick: ");
        int stick1 = Scanner.nextInt();

        System.out.println("Write the length of the second stick: ");
        int stick2 = Scanner.nextInt();

        System.out.println("Write the length of the third stick: ");
        int stick3 = Scanner.nextInt();

        if (stick1 <= 0 || stick2 <= 0 || stick3 <= 0) {
            System.out.println("Error: Your stick is non-existing.");
        } else if (stick1 > stick2 + stick3 || stick2 > stick1 + stick3 || stick3 > stick1 + stick2) {
            System.out.println("You can't form a triangle.");
        }  else {
            System.out.println("With those three stick, you will be able to form a triangle.");
        }
    }
}
