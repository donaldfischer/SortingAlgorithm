package com.hust.grid.leesf.main;

/**
 * Created by LEESF on 2016/9/9.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3, 10, 14, 12, 43, 100, 105};
        selectionSort(array);
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[index] = temp;
        }
    }
}
