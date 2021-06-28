package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class TrigFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of angle in degrees ");


        double degrees = scanner.nextDouble();

        System.out.println("Sin, Cos, and Tan: ");


        double sineOfAngle = Math.sin(degrees);
        double cosOfAngle = Math.cos(degrees);
        double tanOfAngle = Math.tan(degrees);

        System.out.println();
        System.out.println("The Sine of " + degrees + " degrees is : "
                + sineOfAngle);
        System.out.println("The Cosine of " + degrees + " degrees is : "
                + cosOfAngle);
        System.out.println("The Tangent of " + degrees + " degrees is : "
                + tanOfAngle);

        System.out.println();
        System.out.println("ArcSin, ArcCos, ArcTan:");

        double arcSin = Math.toDegrees(Math.asin(degrees));
        double arcCos = Math.toDegrees(Math.acos(degrees));
        double arcTan = Math.toDegrees(Math.atan(degrees));

        System.out.println("\nThe ArcSin of " + degrees + " degrees is : "
                + arcSin);
        System.out.println("The ArcCos of " + degrees + " degrees is : "
                + arcCos);
        System.out.println("The ArcTan of " + degrees + " degrees is : "
                + arcTan);


    }

}


