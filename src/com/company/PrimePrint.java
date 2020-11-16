package com.company;

public class PrimePrint {
    public static void main(String[] args) {
        listAndPrintNumbers();
    }

    public static boolean isPrime(int number) {
        boolean isPrime = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void listAndPrintNumbers() {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }
}
