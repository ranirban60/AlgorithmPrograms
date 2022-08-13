/*
    * Method to perform insertion sort
 */
package com.bridgelabz;

import java.util.Arrays;

public class InsertionSort {
    private String[] array = {"hi","you","are","a","good","boy"}; // Length of array =6

    // array is passed to perform insertion sort
    public void insertionSort(String[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    String temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(obj.array);
    }
}
