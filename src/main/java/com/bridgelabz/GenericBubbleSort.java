/*
Bubble Sort using Generic
 */

package com.bridgelabz;

public class GenericBubbleSort {
    public static void main(String[] args) {
        GenericBubbleSort sort = new GenericBubbleSort();
        String sentence = "can,I,help,you";
        String array[] = sentence.toLowerCase().split(",");
        sort.bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public <K extends Comparable<K>> K bubbleSort(K[] array) {
        K temp = null;
        for (int i = 0; i < array.length; i++) {//Outer for loop
            for (int j = 0; j < array.length - i - 1; j++) {//Inner for loop
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return temp;
    }
}
