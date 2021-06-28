package com.zipcodewilmington.scientificcalculator;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 1) {
            System.out.println("Factorial (" + n + ")");
            return 1;
        } else {
            System.out.println("Factorial (" + n + ")");
            return n * factorial(n - 1);
        }
    }
};
