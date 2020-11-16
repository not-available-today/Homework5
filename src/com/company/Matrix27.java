package com.company;

import java.util.Random;
import java.util.Scanner;

public class Matrix27 {
    public static void main(String[] args) {
        while (true) {
            int n = getUserInput();
            int[][] matrix = new int[n][n];

            initializeUserMatrix(matrix);
            printMatrix(matrix);
            rotateMatrix(matrix, n);
            printMatrix(matrix);
            rotateMatrix(matrix, n);
            printMatrix(matrix);
            rotateMatrix(matrix, n);
            printMatrix(matrix);
        }

    }

    public static int getUserInput() {
        System.out.println("Pick the matrix's dimensions: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[][] initializeUserMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(29 - 27) + 27;
            }
        }
        return matrix;

    }

    public static void printMatrix(int[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rotateMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
    }


}
