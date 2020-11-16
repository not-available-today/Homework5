package com.company;

import java.util.Scanner;

public class FactorialCalc {


    public static void main(String[] args) {


        while (true) {
            int userNumber = getUserInput();
            System.out.println("The factorial of " + userNumber + " is " + findFactorial(userNumber));
        }
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number: ");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static int findFactorial(int userNumber) {
        int factorial = 1;
        for (int i = 2; i <= userNumber; i++)
            factorial *= i;
        return factorial;
    }
}