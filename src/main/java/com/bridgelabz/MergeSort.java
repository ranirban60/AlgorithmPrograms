/*
Program to do Merge sort of list of strings
 */
package com.bridgelabz;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(String[] array, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        //  Sort the first and the second half
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void merge(String[] array, int low, int mid, int high) {

        //Size of the range to be merged
        int n = high - low + 1;
        //Merge both halves into a temporary array b
        String[] b = new String[n];
        // Next element to consider in the first range
        int i1 = low;
        //Next element to consider in the second range
        int i2 = mid + 1;
        int j = 0; // Next open position in b

        // As long as neither i1 nor i2 past the end, move the smaller into b
        while (i1 <= mid && i2 <= high) {
            if (array[i1].compareTo(array[i2]) < 0) {
                b[j] = array[i1];
                i1++;
            } else {
                b[j] = array[i2];
                i2++;
            }
            j++;
        }
            /*
             * Note that only one of the two while loops below is executed copy any
             * remaining entries of the first half
             */
        while (i1 <= mid) {
            b[j] = array[i1];
            i1++;
            j++;
        }

        //Copy any remaining entries of the second half
        while (i2 <= high) {
            b[j] = array[i2];
            i2++;
            j++;
        }

        //Copy back from the temporary array
        for (j = 0; j < n; j++) {
            array[low + j] = b[j];
        }
    }
    public static void main(String[] args) {
        // String type array
        String[] array = { "abc", "acd", "cba", "cab", "bac", "bca" };
        System.out.println("Array Before Merge Sort");
        System.out.println("Result " + Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("Array after Merge sort");
        System.out.println("Result " + Arrays.toString(array));
    }

}
