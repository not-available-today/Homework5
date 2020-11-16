package com.company;

import java.util.Random;
import java.util.Scanner;

public class PlusMinusMatrix {

    public static void main(String[] args) {
        while (true) {
            int n = getUserInput();
            char[][] matrix = new char[n][n];
            initializeUserMatrix(matrix);
            printMatrix(matrix);
        }

    }

    public static int getUserInput() {
        System.out.println("Pick the matrix's dimensions: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void initializeUserMatrix(char[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int counter = random.nextInt(2);
                if (counter == 0) {
                    matrix[i][j] = '+';
                } else {
                    matrix[i][j] = '-';
                }
            }
        }

    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }


}



