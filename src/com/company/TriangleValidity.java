package com.company;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        while (true) {
            int[] array = new int[3];
            getTriangleSides(array);
            boolean isValid = checkValidity(array);
            printResultValidity(isValid);
            if (isValid) {
                double perimeter = calculatePerimeter(array);
                double area = calculateArea(array, perimeter);
                printAreaPerimeter(perimeter, area);
            }
        }
    }

    public static void getTriangleSides(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three measurements to check your triangle's validity: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

    }

    public static boolean checkValidity(int[] array) {
        int a = array[0];
        int b = array[1];
        int c = array[2];

        return (a + b > c & a + c > b & b + c > a);

    }

    public static void printResultValidity(boolean isValid) {
        if (isValid) {
            System.out.println("This triangle is valid.\n");
        } else {
            System.out.println("This is not a valid triangle.\n");
        }
    }

    public static double calculatePerimeter(int[] array) {
        int perimeter = 0;
        for (int i = 0; i < array.length; i++) {
            perimeter += array[i];
        }
        return perimeter;
    }

    public static double calculateArea(int[] array, double perimeter) {
        //Heron's formula
        int a = array[0];
        int b = array[1];
        int c = array[2];
        double s = perimeter / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void printAreaPerimeter(double perimeter, double area) {
        System.out.println("The perimeter of your triangle is " + perimeter);
        System.out.println("The area of your triangle is " + area);
        System.out.println();
    }
}