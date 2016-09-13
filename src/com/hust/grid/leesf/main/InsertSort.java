package com.hust.grid.leesf.main;

/**
 * Created by LEESF on 2016/9/8.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3, 10, 10, 14, 12, 43, 100, 105};
        insertSort(array);
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }

    public static void insertSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            for (; i >= 0 && key < array[i]; i--) {
                array[i + 1] = array[i];
            }
            array[i + 1] = key;
        }
    }
}
