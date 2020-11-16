package com.company;

import java.util.Random;
import java.util.Scanner;

public class MatrixMenu {
    public static void main(String[] args) {
        boolean exitTime = false;
        while (!exitTime) {
            System.out.println("Pick the matrix's dimensions: ");
            int n = getUserInput();
            int[][] matrix = new int[n][n];
            initializeUserMatrix(matrix);
            printMatrix(matrix);
            boolean newMatrix = false;
            while (!newMatrix) {
                System.out.println("Choose how many degrees to rotate matrix:" +
                        "\nEnter 1 for 90* rotation" +
                        "\nEnter 2 for 180* rotation" +
                        "\nEnter 3 for 270* rotation" +
                        "\nEnter 4 to generate a new matrix" +
                        "\nEnter 5 to exit");
                int userChoice = getUserInput();
                if (userChoice < 1 || userChoice > 4) {
                    System.out.println("That is not an option");
                    continue;
                }
                switch (userChoice) {
                    case 1:
                        rotateMatrix(matrix, n);
                        printMatrix(matrix);
                        continue;
                    case 2:
                        rotateMatrix(matrix, n);
                        rotateMatrix(matrix, n);
                        printMatrix(matrix);
                        continue;
                    case 3:
                        rotateMatrix(matrix, n);
                        rotateMatrix(matrix, n);
                        rotateMatrix(matrix, n);
                        printMatrix(matrix);
                        continue;
                    case 4:
                        newMatrix = true;
                        continue;
                    case 5:
                        exitTime = true;
                        break;
                }
            }
        }
        System.out.println("Good bye!");
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void initializeUserMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }
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
