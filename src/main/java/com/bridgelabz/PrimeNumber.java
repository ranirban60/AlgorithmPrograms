/*
Take a range and find prime numbers in that range
 */
package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int lowerLimit, upperLimit;
        Scanner range = new Scanner(System.in);

        System.out.println("Enter Lower Limit: ");
        lowerLimit = range.nextInt();
        System.out.println("Enter Upper Limit : ");
        upperLimit = range.nextInt();

        PrimeNumber primeRange = new PrimeNumber();
        System.out.println("Prime numbers between the range " + lowerLimit + " to " +upperLimit+ " are:" );
        primeRange.prime(lowerLimit, upperLimit);
    }
    public void prime(int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            if (i == 1 || i == 0)
                continue;
            int flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}
