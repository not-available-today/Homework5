package com.company;

import java.util.Scanner;

public class CubeOfConsoleInput {
    public static void main(String[] args) {
        int[] array = new int[2];
        getUserInput(array);
        int product = multiplyUserInput(array);
        int cube = cubeUserInputProduct(product);
        printCube(array[0], array[1], cube);

    }

    public static void getUserInput(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input a number");
            array[i] = scanner.nextInt();
        }

    }

    public static int multiplyUserInput(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }

    public static int cubeUserInputProduct(int product) {
        double cube = Math.pow(product, 3);
        return (int) cube;
    }

    public static void printCube(int multiplicand, int multiplier, int cube) {
        System.out.println("(" + multiplicand + " * " + multiplier + ")^3 = " + cube);
    }
}
