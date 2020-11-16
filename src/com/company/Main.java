package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        initializeArray(array);
        printArray(array);
        reverseArray(array);
        System.out.print("Reversed array is \n");
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

    // reverses array
    public static void reverseArray(int[] array) {

        for (int first = 0, last = array.length - 1; first < last; first++, last--) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
        }

    }
}







