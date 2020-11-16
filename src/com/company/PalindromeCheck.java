package com.company;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {


        while (true) {
            String stringInput = getUserInput();
            checkIfPalindrome(stringInput);
            if (checkIfPalindrome(stringInput)) {
                System.out.println("This is a palindrome.");
            } else {
                System.out.println("This isn't a palindrome");
            }
            System.out.println();
        }

    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check: ");
        return scanner.nextLine();
    }

    public static boolean checkIfPalindrome(String userInputString) {
        for (int i = 0; i < userInputString.length(); i++) {
            if (userInputString.charAt(i) != userInputString.charAt(userInputString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}

