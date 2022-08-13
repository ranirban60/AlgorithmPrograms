/*
An Anagram Detection
 */

package com.bridgelabz;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramDetection {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("Enter First String");
        String string1 = string.nextLine().toLowerCase();
        System.out.println("Enter Second String");
        String string2 = string.nextLine().toLowerCase();

        if (string1.length() != string2.length()) {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        } else {
            char[] s1Array = string1.toLowerCase(Locale.ROOT).toCharArray();
            char[] s2Array = string2.toLowerCase(Locale.ROOT).toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            if (Arrays.equals(s1Array, s2Array)) {
                System.out.println(string1 + " and " + string2 + " are anagrams.");
            }
        }
    }
    }
