package com.company;

import java.util.Scanner;

public class MinimumOfThree {

    public static void main(String[] args) {
        int[] array = new int[3];
        getUserInput(array);
        int minimum = compareNumbers(array);
        printResults(array, minimum);
    }

    public static void getUserInput(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input a number");
            array[i] = scanner.nextInt();
        }

    }

    public static int compareNumbers(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static void printResults(int[] array, int minimum) {
        System.out.println("Out of your chosen numbers :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(" the smallest is " + minimum + ".");
    }
}
