package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CalculatorEngine {
    public static void main(String[] args) {
        int choice;
        String switchDisplayMode;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Display Mode");
        System.out.println("1. decimal");
        System.out.println("2. binary");
        System.out.println("3. octal");
        System.out.println("4. hexadecimal");
        System.out.println("Enter choice: 1-4" + "\n");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                switchDisplayMode = "decimal";
                break;
            case 2:
                switchDisplayMode = "binary";
                break;
            case 3:
                switchDisplayMode = "octal";
                break;
            case 4:
                switchDisplayMode = "hexadecimal";
                break;
            default:
                switchDisplayMode = "Invalid.";
                break;
        }
        System.out.println("Display Mode: "+ switchDisplayMode);

    }

    }

