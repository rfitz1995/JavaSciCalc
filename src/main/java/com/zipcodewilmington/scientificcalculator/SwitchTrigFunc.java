package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SwitchTrigFunc { public static void main(String[] args) {
    int choice;
    String switchUnitMode;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Unit Mode");
    System.out.println("1. Degrees");
    System.out.println("2. Radians");
    System.out.println("Enter choice: 1 or 2" + "\n");
    choice = scanner.nextInt();

    switch (choice) {
        case 1:
            switchUnitMode = "degrees";
            break;
        case 2:
            switchUnitMode = "radians";
            break;
        default:
            switchUnitMode = "Invalid.";
            break;
    }
    System.out.println("Unit Mode: "+ switchUnitMode);

}

}
