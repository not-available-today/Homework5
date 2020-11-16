package com.company;

import java.util.Random;

public class SumOfRandom {
    public static void main(String[] args) {
        int[] array = new int[2];
        generateRandomNumbers(array);
        printEquation(array);
        System.out.print(addNumbers(array));
    }

    public static void generateRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(89) + 10;

        }
    }

    public static void printEquation(int[] array) {
        System.out.print(array[0] + " + " + array[1] + " = ");
    }

    public static int addNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
