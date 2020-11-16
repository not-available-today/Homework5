package com.company;

import java.util.Random;

public class InitializeAndPrintArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        initializeArray(array);
        printArray(array);
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
}
