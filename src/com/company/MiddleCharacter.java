package com.company;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        while (true) {
            String userInput = getUserInput();
            findMiddleCharacter(userInput);
            System.out.print("The middle character in the string: " + findMiddleCharacter(userInput) + "\n");

        }
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        return scanner.nextLine();
    }

    public static String findMiddleCharacter(String userInput) {
        int position;
        int length;
        if (userInput.length() % 2 == 0) {
            position = userInput.length() / 2 - 1;
            length = 2;
        } else {
            position = userInput.length() / 2;
            length = 1;
        }
        return userInput.substring(position, position + length);
    }
}

