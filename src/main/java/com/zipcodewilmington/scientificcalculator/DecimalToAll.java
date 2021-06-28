package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class DecimalToAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = 0;

        System.out.println("Enter a decimal number: ");
        decimal = scanner.nextInt();

        String binary, octal, hexadecimal;

        binary =  Integer.toBinaryString(decimal);
        octal = Integer.toOctalString(decimal);
        hexadecimal = Integer.toHexString(decimal);

        System.out.println("Binary: " + binary + "  Octal: " + octal + "  Hexadecimal: " + hexadecimal );
    }
}