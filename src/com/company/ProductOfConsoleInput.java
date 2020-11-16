package com.company;

import java.util.Scanner;

public class ProductOfConsoleInput {
    public static void main(String[] args) {
        int[] array = new int[2];
        getUserInput(array);
        System.out.println(array[0] + " * " + array[1] + " = " + multiplyUserInput(array));
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


}
