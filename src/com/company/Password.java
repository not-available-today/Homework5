package com.company;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        String password = " ";
        boolean isValid = checkPasswordValidity(password);
        while (!isValid) {
            password = getUserPassword();
            isValid = checkPasswordValidity(password);
            printResult(isValid);
        }
    }

    public static String getUserPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" + "" +
                "Please enter your desired password: ");
        return scanner.nextLine();
    }

    public static boolean checkPasswordValidity(String userPassword) {

        int numberCount = 0;
        int letterCount = 0;
        for (int i = 0; i < userPassword.length(); i++) {
            char ch = Character.toUpperCase(userPassword.charAt(i));
            ;
            if (ch >= 'A' && ch <= 'Z') {
                letterCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                return false;
            }

        }
        return ((letterCount + numberCount >= 10) & (numberCount >= 2));
    }

    public static void printResult(boolean isValid) {
        if (isValid) {
            System.out.println("Your password is valid.");
        } else {
            System.out.println("That doesn't fit the parameters.\n" +
                    "Try again.");
        }
    }


}
