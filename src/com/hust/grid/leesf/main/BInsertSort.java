package com.hust.grid.leesf.main;

import java.util.Arrays;

/**
 * Created by LEESF on 2016/9/8.
 */
public class BInsertSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3, 10, 10, 14, 12, 43, 100, 105};
        bInsertSort(array);
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }

    public static void bInsertSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int low = 0;
            int high = j - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (array[mid] > key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            for (int i = j - 1; i >= low; i--) {
                array[i + 1] = array[i];
            }
            array[low] = key;
        }
    }
}
