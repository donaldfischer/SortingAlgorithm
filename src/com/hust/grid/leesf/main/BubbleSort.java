package com.hust.grid.leesf.main;

/**
 * Created by LEESF on 2016/9/9.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3, 10, 14, 12, 43, 100, 105};
        bubbleSort(array);
        bubbleSort1(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
    }
}
