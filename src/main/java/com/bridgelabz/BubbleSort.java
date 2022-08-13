/*
Bubble Sort
 */

package com.bridgelabz;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int array[] = {5,93,58,74,87,93,10,53,97};
        sort.bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {//Outer for loop
            for (int j = 0; j < array.length - i - 1; j++) {//Inner for loop
                if (array[j] > (array[j + 1])) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
