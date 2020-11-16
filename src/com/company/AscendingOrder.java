package com.company;

import java.util.Random;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] array = new int[10];
        initializeArray(array);
        printArray(array);
        int[] ascendingOrder = sortAscending(array);
        printArray(ascendingOrder);
    }

    //initializes array
    public static void initializeArray(int[] array) {

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(89) + 10;

        }
    }

    //prints out array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }

    public static int[] sortAscending(int[] array) {
        int compare;
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] < array[j]) {
                    compare = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = compare;
                }

            }

        }
        return array;
    }
}
