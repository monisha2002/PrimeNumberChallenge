package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert any number: ");
        int num = scanner.nextInt();
        if (isPrimeNumber(num)){
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }

    }
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i=2; i<Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
