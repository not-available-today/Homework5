package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        while (true) {
            int userInput = getUserInput();
            boolean isLeapYear = calculateIfLeapYear(userInput);
            printResult(isLeapYear, userInput);
        }
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        return scanner.nextInt();
    }

    public static boolean calculateIfLeapYear(int userInput) {
        boolean isLeapYear = false;
        if (userInput % 4 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public static void printResult(boolean isLeapYear, int userInput) {
        if (isLeapYear) {
            System.out.println(userInput + " is a leap year!\n");
        } else {
            System.out.println(userInput + " is not a leap year.\n");
        }
    }
}
