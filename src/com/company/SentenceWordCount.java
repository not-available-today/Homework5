package com.company;

import java.util.Scanner;

public class SentenceWordCount {
    public static void main(String[] args) {
        String userInput = getUserInput();
        int wordCount = countWords(userInput);
        printResults(userInput, wordCount);
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        return scanner.nextLine();
    }

    public static int countWords(String userInput) {
        int count = 0;
        boolean isWord = false;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == ' ' || userInput.charAt(i) == '\n') {
                isWord = false;
            } else if (!isWord) {
                isWord = true;
                count++;
            }
        }
        return count;
    }

    public static void printResults(String userInput, int count) {
        System.out.println("Your sentence: " + userInput);
        System.out.println("has " + count + " words.");
    }

}
