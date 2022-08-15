package com.bridgelabz;

import java.util.Scanner;

public class FindNumber {
    static Scanner S = new Scanner(System.in);
    static int find() {
        int low = 0, high = 127, mid;
        while (low != high) {
            mid = (low + high) / 2;
            System.out.println("Enter 1 if number is between " + low + " - " + mid + "\nEnter 2 if number is between "
                    + (mid + 1) + " - " + high);
            int c = S.nextInt();
            mid = (low + high) / 2;
            if (c == 1)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
    public static void main(String[] args) {
        System.out.println("Guess a number between 0 to 127 ");
        S.next();
        try {
            System.out.println("Guessed number is " + find());
        } catch (Exception e) {
            System.out.println("Enter Correct Input");
        }
    }
}
