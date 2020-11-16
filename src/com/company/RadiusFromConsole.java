package com.company;

import java.util.Scanner;

public class RadiusFromConsole {
    public static void main(String[] args) {
        int radius = getRadius();
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);
        printResult(radius, area, circumference);

    }

    public static int getRadius() {
        System.out.println("Please enter the desired radius: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double calculateArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateCircumference(int radius) {
        return 2 * Math.PI * radius;
    }

    public static void printResult(int radius, double area, double circumference) {
        System.out.println("\nThe area for a circle with a radius of " + radius + " is " + area + ".\n");
        System.out.println("\nThe circumference for a circle with a radius of " + radius + " is " + circumference + ".");


    }
}
